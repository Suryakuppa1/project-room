package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Model;

@WebServlet("/Register")
public class Register extends HttpServlet{

	protected  void service (HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		String name = request.getParameter("name");
		String mobilenumber = request.getParameter("mobilenumber");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Model model = new Model();
		model.setName(name);
		model.setMobilenumber(mobilenumber);
		model.setEmail(email);
		model.setUsername(username);
		model.setPassword(password);
		
		boolean status = model.register();
		if(status == true) {
			response.sendRedirect("/oyo/registerSuccess.jsp");
		}
		else
		{
			response.sendRedirect("/oyo/registerFail.jsp");
		}
		
		
	}

}
