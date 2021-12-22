package com.marondal.db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.MysqlService;
@WebServlet("/db/ex01_insert")
public class DatabaseEx01Insert extends HttpServlet {

	
	@Override
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
			String name = request.getParameter("name");
			String yyyymmdd = request.getParameter("yyyymmdd");
			String introduce = request.getParameter("introduce");
			String email = request.getParameter("email");
			
			PrintWriter out = response.getWriter();
			MysqlService mysqlService = MysqlService.getInstance();
			mysqlService.connect();
			
			String query = "INSERT INTO `new_user`\r\n"
					+ "(`name`,`yyyymmdd`,`introduce`,`email`,`createdAt`,`updatedAt`)\r\n"
					+ "VALUES\r\n"
					+ "('"+name+"','"+yyyymmdd+"','"+introduce+"','"+email+"',now(),now());";
			
				mysqlService.update(query);
				
				mysqlService.disconnect();
				
				//다른페이지로 바로 이동
				//redirect
				response.sendRedirect("/db/ex01_1.jsp");
				
				//삭제하기
				
	}
}
