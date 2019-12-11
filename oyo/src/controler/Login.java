package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Model;

@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		Model model = new Model();
		model.setUsername(username);
		model.setPassword(password);
		boolean status = model.login();
		if(status == true) {
			
			{
				String name = model.getName();
				HttpSession  session = request.getSession();
				session.setAttribute("name", name);
				response.sendRedirect("/oyo/home.jsp");
			}
			
		}
		else 
		{
			
			response.sendRedirect("/oyo/loginfail.jsp");
		}
	}

}
