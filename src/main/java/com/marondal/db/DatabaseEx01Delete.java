package com.marondal.db;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.MysqlService;
@WebServlet("/db/ex01_delete")
public class DatabaseEx01Delete extends HttpServlet{

	
	
	@Override 
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "DELETE*FROM `new_user` WHERE `id` = "+ id + ";";
		
		mysqlService.update(query);
		mysqlService.disconnect();
		
		response.sendRedirect("/db/ex01_1.jsp");
		
	}
}
