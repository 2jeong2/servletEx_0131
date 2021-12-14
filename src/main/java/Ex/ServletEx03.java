package Ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/ex03")

public class ServletEx03 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//html을 통해서 1~10까지의 합을 전달
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		//1~10까지 합
		int sum=0;
		for(int i = 0; i<=10; i++) {
			sum += i;
		}
		//<html>
		out.println("<html><head><title>합계</title></head>");
		out.println("<body>합계:<strong>" + sum + "</strong> </body></html>");
		
		
		
		
		
		
	}
}
