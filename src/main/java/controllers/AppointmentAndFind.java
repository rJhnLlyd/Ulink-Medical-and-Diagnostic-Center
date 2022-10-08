package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AppointmentDao;
import model.Appointment;


@WebServlet("/AppointmentAndFind")

public class AppointmentAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AppointmentAndFind() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search = request.getParameter("search");
		
		if(search == null) {
			search="";
		}
		
		List<Appointment> appointment = AppointmentDao.find(search);
		
		request.setAttribute("appointment", appointment);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("index.jsp");
		resquesDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Appointment appointment = new Appointment();
		
		appointment.setFname(request.getParameter("fname"));
		appointment.setLname(request.getParameter("lname"));
		appointment.setMi(request.getParameter("mi"));
		appointment.setAge(request.getParameter("age"));
		appointment.setGender(request.getParameter("gender"));
		appointment.setMobile(request.getParameter("mobile"));
		appointment.setEmail(request.getParameter("email"));
		appointment.setTest(request.getParameter("test"));
		appointment.setDate(request.getParameter("date"));
		appointment.setTime(request.getParameter("time"));
		appointment.setPsid(request.getParameter("psid"));
		
		AppointmentDao.create(appointment);
		
		doGet(request, response);
	}

}
