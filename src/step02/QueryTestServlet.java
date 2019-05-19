package step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class QueryTestServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobby = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String religion = req.getParameter("religion");
		String intro = req.getParameter("introduction");
		out.print("<!DOCTYPE html>");
		out.print("<head>");
		out.print("	<title>Document</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>GET 방식으로 요청되었습니다.</h1>");
		out.print("ID: "+id+"<br>");
		out.print("password: "+password+"<br>");
		out.print("name: "+name+"<br>");
		if(hobby != null) {
			for(String item : hobby) {
				out.print("hobby: "+item+"<br>");
			}
		}
		out.print("gender: "+gender+"<br>");
		out.print("religion: "+religion+"<br>");
		out.print("intro: "+intro+"<br>");
		out.print("전체 쿼리 문자열 : "+req.getQueryString()+"<br>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobby = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String religion = req.getParameter("religion");
		String intro = req.getParameter("introduction");
		System.out.println(gender+":"+religion+":"+intro);
		out.print("<!DOCTYPE html>");
		out.print("<head>");
		out.print("	<title>Document</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>POST 방식으로 요청되었습니다.</h1>");
		out.print("ID: "+id+"<br>");
		out.print("password: "+password+"<br>");
		out.print("name: "+name+"<br>");
		if(hobby != null) {
			for(String item : hobby) {
				out.print("hobby: "+item+"<br>");
			}
		}
		out.print("gender: "+gender+"<br>");
		out.print("religion: "+religion+"<br>");
		out.print("intro: "+intro+"<br>");
		out.print("전체 쿼리 문자열 : "+req.getQueryString()+"<br>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
