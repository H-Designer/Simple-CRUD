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
import javax.swing.JOptionPane;

import msg.information;
import dao.userdao;
/**
 * Servlet implementation class CrudServlet
 */
@WebServlet("/CrudServlet")
public class CrudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrudServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//String  search=request.getParameter("search");
		HttpSession session = request.getSession();
		//基本信息情况
		List<information> userBeans = new ArrayList<information>();
		userdao userdao=new userdao();
		userBeans=userdao.listNeed();
		request.setAttribute("userBeans", userBeans);
		session.setAttribute("userBeans", userBeans);
		
		//System.out.println("1"+userBeans);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		JOptionPane.showMessageDialog(null, "删除成功");	
//		response.sendRedirect("/340message.jsp");
		request.getRequestDispatcher("/340message.jsp").forward(request, response);	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		doGet(request, response);
	}

}
