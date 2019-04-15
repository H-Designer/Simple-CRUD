package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.userdao;
import msg.information;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		int id=Integer.parseInt(request.getParameter("id"));
		String phonenumber=request.getParameter("phonenumber");
		String duixiang=request.getParameter("duixiang");
		userdao userdao=new userdao();
		userdao.update(name,age,phonenumber,duixiang,id);
		HttpSession session = request.getSession();
		//基本信息情况
		List<information> userBeans = new ArrayList<information>();
		userBeans=userdao.listNeed();
		request.setAttribute("userBeans", userBeans);
		session.setAttribute("userBeans", userBeans);
		request.getRequestDispatcher("/340message.jsp").forward(request, response);	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doGet(request, response);
	}

}
