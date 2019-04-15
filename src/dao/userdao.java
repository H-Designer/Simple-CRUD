package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.dutil;
import msg.information;

public class userdao {
	//查询所有信息
	public List<information> listNeed(){
		List<information> needBeans = new ArrayList<information>();
		
		String sql = "select * from 340message";
		Connection conn =dutil.getConnection();
		Statement state =null;
		ResultSet rs = null;
		information userBean =null;
		try{
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			while(rs.next()){
				userBean = new information();
				userBean.setAge(rs.getInt("age"));
				userBean.setDuixiang(rs.getString("duixiang"));
				userBean.setId(rs.getInt("id"));
				userBean.setName(rs.getString("name"));
				userBean.setPhonenumber(rs.getString("phonenumber"));
				needBeans.add(userBean);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			dutil.close(rs, state, conn);
		}
		return needBeans;
	}
	//姓名查询
	public List<information> select(String  name){
		List<information> infors = new ArrayList<information>();
		String sql="select * from 340message where name=?";
		PreparedStatement preparedStatement = null;
		Connection connection = dutil.getConnection();
		ResultSet resultSet=null;
		information infor =null;
		try{
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				infor = new information();
				infor.setId(resultSet.getInt("id"));
				infor.setAge(resultSet.getInt("age"));
				infor.setDuixiang(resultSet.getString("duixiang"));
				infor.setName(resultSet.getString("name"));
				infor.setPhonenumber(resultSet.getString("phonenumber"));
				infors.add(infor);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			dutil.close(resultSet);
			dutil.close(preparedStatement);
			dutil.close(connection);
		}
		return infors;
	}
	//删除
	public void delete(int id) {
		Connection conn =dutil.getConnection();
		String sql = "delete from 340message where id = ?";
		PreparedStatement preparedStatement = null;
		Statement state =null;
		ResultSet rs = null;
		try {
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dutil.close(rs, state, conn);
		}
		
	}
	//增加信息
	public void add(String name , int age , String phonenumber , String duixiang) {
		Connection conn =dutil.getConnection();
		String sql = "insert into 340message(name,age,phonenumber,duixiang) values (?,?,?,?)";
		PreparedStatement preparedStatement = null;
		Statement state =null;
		ResultSet rs = null;
		try {
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, age);
			preparedStatement.setString(3, phonenumber);
			preparedStatement.setString(4, duixiang);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dutil.close(rs, state, conn);
		}
		
	}
	//修改信息
	public void update(String name , int age , String phonenumber , String duixiang , int id) {
		Connection conn =dutil.getConnection();
		String sql = "update 340message set name=?,age=?,phonenumber=?,duixiang=?  where id=? ";
		PreparedStatement preparedStatement = null;
		Statement state =null;
		ResultSet rs = null;
		try {
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, age);
			preparedStatement.setString(3, phonenumber);
			preparedStatement.setString(4, duixiang);
			preparedStatement.setInt(5, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dutil.close(rs, state, conn);
		}
		
	}
}
