package controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.HotelModel;

@WebServlet("/HotelsList")
public class HotelsList extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		 HttpSession session = request.getSession();
	
		 HotelModel hm = new HotelModel();
		 List<String> al = hm.hotelslist();
		 if(al.isEmpty()) {
		
		 response.sendRedirect("/oyo/hotellistfail.jsp");	 
	}
	 else
	 {
		 session.setAttribute("al", al);
		 response.sendRedirect("/oyo/hotelslist.jsp");
		 
	 }
	
	

	
	}
}
