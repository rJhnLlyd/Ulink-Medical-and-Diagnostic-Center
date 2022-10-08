package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AppointmentDao;
import model.Appointment;

/**
 * Servlet implementation class ClienteFindAndUpdate
 */
@WebServlet("/PatientUpdate")
public class AppointmentFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AppointmentFindAndUpdate() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int appointmentId = Integer.parseInt(request.getParameter("appointmentId"));
		Appointment appointment = AppointmentDao.findByPk(appointmentId);
		
		request.setAttribute("appointment", appointment);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Appointment appointment = new Appointment();
		
		appointment.setId(Integer.parseInt(request.getParameter("id")));
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
		
		AppointmentDao.update(appointment);
		
		AppointmentFindAndUpdate appointmentFindAndUpdate = new AppointmentFindAndUpdate();
		appointmentFindAndUpdate.doGet(request, response);
	}

}