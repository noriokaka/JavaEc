package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDAO;
import model.Person;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s_id=request.getParameter("id");
		if(s_id==null) {
			response.sendRedirect("/personapp/Read");
		}else {
			PersonDAO dao=new PersonDAO();
			Person person=dao.findOne(Integer.parseInt(s_id));
			request.setAttribute("person", person);
			request.getRequestDispatcher("/WEB-INF/view/update.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		Person person=new Person(Integer.parseInt(id),name,age);
		PersonDAO dao=new PersonDAO();
		dao.updateOne(person);
		response.sendRedirect("/personapp/Read");
	}

}
