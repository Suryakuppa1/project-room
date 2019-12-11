package controler;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.HotelModel;
import model.Model;

@WebServlet("/RoomDetails")
public class RoomDetails extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		String hotelname = request.getParameter("hotelname");
		String datebook = request.getParameter("datebook");
		String noofguests = request.getParameter("noofguests");
		String meals = request.getParameter("meals");
		String username = request.getParameter("username");
		
		
		Model model = new Model();
		
		model.setHotelname(hotelname);
		model.setDatebook(datebook);
		model.setNoofguests(noofguests);
		model.setMeals(meals);	
		model.setUsername(username);
		model.roomdetails();
		
		boolean status = model.roomdetails();
		if(status == true)
		{
			
			response.sendRedirect("/oyo/roomdetailsuccess.jsp");
		
		}
		else
		{
			response.sendRedirect("/oyo/roomdetailsfail.jsp");
		}

	}
}
