package Ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx01 extends HttpServlet {

	 @Override
	    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		 //한글 깨짐 방지
		 response.setCharacterEncoding("UTF-8");
		 //MIME
		 response.setContentType("text/plain");
		 
		 
		 //날짜를 저장하는 클래스
		 Date now = new Date();
		 
		 
	        PrintWriter out = response.getWriter();
	        out.println(now);
	    
	        //formatter
	        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String dateString = format.format(now);
	        out.println(dateString);
	 }
	
}
