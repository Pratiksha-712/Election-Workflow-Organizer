package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Candidate;



public class Dao {
List<Candidate> allcandidate = null;
	
	String url = "jdbc:mysql://localhost:3306/advjava193";
	String uname = "root";
	String pwd = "root";
	
	Connection connection = null;
	Statement st = null;
	ResultSet rs = null;
	String sql = "select * from advjava193.candidate";
	//String sqlinsert = "INSERT INTO advjava193.candidate Values(102,'test','test','test','test','test',60)";
	String sqlinsert2 = "INSERT INTO advjava193.candidate Values(?,?,?,?,?,?,?)";
	
	
	public List<Candidate> getAllCandidates(){
		System.out.println("we are in dao layer");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(1);
			
			connection = DriverManager.getConnection(url, uname, pwd);
			System.out.println(2);
			
			st = connection.createStatement();
//			int id = 1111;
//			String cname = "viru";
//			String pname ="Independent";
//			String stname = "MH" ;
//			String aname = "Pune";
//			String gen = "Male";
//			int age = 44;
//			PreparedStatement pst = connection.prepareStatement(sqlinsert2);
//			pst.setInt(1, id);
//			pst.setString(2, cname);
//			pst.setString(3, pname);
//			pst.setString(4, stname);
//			pst.setString(5, aname);
//			pst.setString(6, gen);
//			pst.setInt(7, age);
//			
//			int rows = pst.executeUpdate();
//			
//			System.out.println(3);
//			int id = 1001;
//			String cname = "Jay";
//			String pname ="Independent";
//			String stname = "MH" ;
//			String aname = "Pune";
//			String gen = "Male";
//			int age = 35;
//			String sqlinsert = "INSERT INTO advjava193.candidate Values("+id+",'"+cname+"','"+pname+"','"+stname+"','"+aname+"','"+gen+"',"+age+")";
//			
//			int rows = st.executeUpdate(sqlinsert);
//			if(rows>0) {
//				System.out.println("Data inserted successfully");
//			}else {
//				System.out.println("something went wrong....");
//			}
			
			rs = st.executeQuery(sql);
//			System.out.println(4);
			allcandidate = new ArrayList<Candidate>();
			
			while(rs.next()) {
				int id = rs.getInt("c_id");
				String cname = rs.getString("name");
				String pname = rs.getString("partyname");
				String stname = rs.getString("state");
				String aname = rs.getString("assembly");
				String gen = rs.getString("gender");
				int age = rs.getInt("age");
				
				//System.out.println(id + cname + pname);
				Candidate obj = new Candidate(id,cname,pname,stname,aname,gen,age);
				allcandidate.add(obj);
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allcandidate;
	}
	
	public List<Candidate> updateAllCandidates() throws SQLException{
		int  age1 = 59;
		int c_id1 = 4;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava193","root","root");
			
			PreparedStatement ps = con.prepareStatement("update candidate set age=? where c_id=?");
			ps.setInt(1, age1);
			ps.setInt(2, c_id1);
			
			int count = ps.executeUpdate();
			if(count>0) {
				System.out.println("updated successfully");
			}
			else {
				System.out.println("updation failed");
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return allcandidate;
		return allcandidate;
		
	}
	
	public List<Candidate> deleteAllCandidates() throws Exception{
		String c_id1= "4";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava193","root","root");
		
		PreparedStatement ps = con.prepareStatement("delete from candidate where c_id=?");
		ps.setString(1, c_id1);
		int count = ps.executeUpdate();
		if(count>0) {
			System.out.println("deletion success");
		}
		else {
			System.out.println("deletion failed");
		}
		return allcandidate;
		
	}
	
//	public List<Candidate> getAllBJPCandidates(){
//
//		try {
//			Connection conn = DriverManager.getConnection(url, uname,pwd );
//			conn.prepareStatement(sql)
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return allcandidate;
//		
//	}

}
