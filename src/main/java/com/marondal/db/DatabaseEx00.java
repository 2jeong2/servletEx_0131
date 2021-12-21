package com.marondal.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/db/ex00")
public class DatabaseEx00 extends HttpServlet{
	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("Database Hello World!");
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			//접속 정보
			String url = "jdbc:mydql://localhost:3306/test_1106";
			String userId = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, userId, password);
			Statement statement = connection.createStatement();
			
			//중고 물품 리스트 가져오기
			String selectQuery = "SELECT*FROM `user_goods`";
			ResultSet resultSet = statement.executeQuery(selectQuery);
			
			while (resultSet.next()){
				
				String title = resultSet.getString("title");
				out.print("제품명 : "+ title);
				int price = resultSet.getInt("price");
				out.println("가격 : "+price + "<br>");
			}
			
			String insertQuery = "INSERT INTO `user_goods`\r\n"
					
			+"(`title`, `price`,`description`,`sellerId`,`createdAt`,`updatedAt`)"
			+"VALUES\r\n"
			+"('고양이 간식 팝니다', 2000,'저희 고양이가 까다로워서 안먹네요',5,now(),now())";
			
			
			
//			int count = statement.executeUpdate(insertQuery);
//			
//			out.println("삽입 : " + count);
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
