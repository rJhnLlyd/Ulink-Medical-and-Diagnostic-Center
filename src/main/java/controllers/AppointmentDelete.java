package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AppointmentDao;

/**
 * Servlet implementation class ClienteDelete
 */
@WebServlet("/PatientDelete")
public class AppointmentDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AppointmentDelete() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int appointmentId = Integer.parseInt(request.getParameter("appointmentId"));
		AppointmentDao.delete(appointmentId);
		
		AppointmentFindAndUpdate appointmentFindAndUpdate = new AppointmentFindAndUpdate();
		appointmentFindAndUpdate.doGet(request, response);
		
	}

}