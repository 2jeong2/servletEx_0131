package Ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/ex04")
public class ServletEx04 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setContentType("application/json");
		
		PrintWriter out =response.getWriter();
		
		//이름,나이
		String name = request.getParameter("name");
		String ageString = request.getParameter("age");
		
		int age = Integer.parseInt(ageString);
		age++;
		
//		out.println("<html><head><title>get 파라미터</title></head>");
//		out.println("<body> <h2>이름 : " + name + "</h2> <h2>" + age + "</h2> </body></html>");
		
//		Map
//		{"name":"이정이","age":00}
		
		out.println("{\"name\":\""+ name +"\",\"age\":"+ age + "}");
		
	}
}
