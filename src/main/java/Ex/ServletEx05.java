package Ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class ServletEx05 extends HttpServlet{
	
	@Override
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		//회원 id, 이름, 이메일 파라미터로 받고, 테이ㅣ블로 예쁘게 보여준다.
		
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>회원정보</title></head>");
		out.println("<body>");
		out.println("<th>");
		
		out.println("아이디 : " + userId );
		
		out.println("이름 : "+name);
		
		out.println("이메일 : "+email);
		
		out.println("</th>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}

}
