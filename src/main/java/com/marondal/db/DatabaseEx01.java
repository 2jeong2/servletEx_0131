package com.marondal.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.MysqlService;
@WebServlet("/db/ex01")
public class DatabaseEx01 extends HttpServlet{

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();
		
		MysqlService mysqlservice = MysqlService.getInstance();
		mysqlservice.connect();
		
		String query = "SELECT *FROM `user_goods`";
		ResultSet resultSet = mysqlservice.select(query);
		
		
		
		try {
			while(resultSet.next()) {
				out.println("제목 : "+ resultSet.getString("title")+"<br>");
				out.println("가격 : " + resultSet.getInt("price") + "<br>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mysqlservice.disconnect();
		
	}
}
