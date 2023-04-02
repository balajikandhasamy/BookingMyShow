package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookingDao;
import dto.BookingDto;

@WebServlet("/asd")
public class BookMyShow extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		// String s1=req.getParameter("booking_id");
		String s1 = req.getParameter("customer_name");
		String s2 = req.getParameter("movie_name");
        String s3 = req.getParameter("seat_number");
		int seat_number = Integer.parseInt(s3);
		String s6 = req.getParameter("no_of_ticket");
		int no_of_ticket = Integer.parseInt(s6);
		String s5 = req.getParameter("ticket_price");
		double ticket_price = Double.parseDouble(s5);
		ticket_price = no_of_ticket * ticket_price;
		
		BookingDto dto = new BookingDto();
		dto.setCustomer_name(s1);
		dto.setMovie_name(s2);
		dto.setSeat_number(seat_number);
		dto.setTicket_price(ticket_price);
		dto.setNo_of_ticket(no_of_ticket);
		
		BookingDao d = new BookingDao();
		d.insert(dto);
		resp.getWriter().print("<h1>successfully insert the data from the database</h1>");
	}
}
