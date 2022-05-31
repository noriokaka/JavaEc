package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int humanAge=age*7;

		/*
		String errorMsg="";
		if(name == null || name.length()==0) {
			errorMsg+="名前が入力されていません<br>";
		}
		if(age == null || age.length() == 0) {
			errorMsg+="年齢が入力されていません<br>";
		}
		*/

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>犬年齢計算</title>");
		out.println("</head>");
		out.println("<body>");
		out.printf("<p>%s（%d歳）は人間に換算すると%d歳です</P>%n",name,age,humanAge);
		out.println("<a href='/dogAge/index.jsp'>戻る</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
