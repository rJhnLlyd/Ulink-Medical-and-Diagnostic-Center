package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.MySqlConnection;
import model.Appointment;

public class AppointmentDao {
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(Appointment appointment) {
		 sql = "INSERT INTO appointment VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, appointment.getFname());
			 preparedStatement.setString(2, appointment.getLname());
			 preparedStatement.setString(3, appointment.getMi());
			 preparedStatement.setString(4, appointment.getAge());
			 preparedStatement.setString(5, appointment.getGender());
			 preparedStatement.setString(6, appointment.getMobile());
			 preparedStatement.setString(7, appointment.getEmail());
			 preparedStatement.setString(8, appointment.getTest());
			 preparedStatement.setString(9, appointment.getDate());
			 preparedStatement.setString(10, appointment.getTime());
			 preparedStatement.setString(11, appointment.getPsid());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct insert on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		 }
	}
	
	public static void delete(int appointmentId) {
		sql = "DELETE FROM appointment WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, appointmentId);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on appointment");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on appointment. " + e.getMessage());
		}
	}
	
	public static List<Appointment> find(String search){
		
		sql = String.format("SELECT * FROM appointment WHERE id like '%s%%' OR fname LIKE '%s%%' ", search, search);
		List<Appointment> appointments = new ArrayList<Appointment>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Appointment appointment = new Appointment();
				
				appointment.setId(resultSet.getInt("id"));
				appointment.setFname(resultSet.getString("fname"));
				appointment.setLname(resultSet.getString("lname"));
				appointment.setMi(resultSet.getString("mi"));
				appointment.setAge(resultSet.getString("age"));
				appointment.setGender(resultSet.getString("gender"));
				appointment.setMobile(resultSet.getString("mobile"));
				appointment.setEmail(resultSet.getString("email"));
				appointment.setTest(resultSet.getString("test"));
				appointment.setDate(resultSet.getString("date"));
				appointment.setTime(resultSet.getString("time"));
				appointment.setPsid(resultSet.getString("psid"));
				
				appointments.add(appointment);
				
			}
			
			System.out.println("--correct find appointment");
			return appointments;
			
		} catch(SQLException e) {
			System.out.println("--incorrect find appointment. " + e.getMessage());
			return null;
		}
		
		
	}
	
	public static Appointment findByPk(int appointmentId) {
		sql = String.format("SELECT * FROM appointment WHERE id = %d ", appointmentId);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Appointment appointment = new Appointment();
			
			while (resultSet.next()) {
				appointment.setId(resultSet.getInt("id"));
				appointment.setFname(resultSet.getString("fname"));
				appointment.setLname(resultSet.getString("lname"));
				appointment.setMi(resultSet.getString("mi"));
				appointment.setAge(resultSet.getString("age"));
				appointment.setGender(resultSet.getString("gender"));
				appointment.setMobile(resultSet.getString("mobile"));
				appointment.setEmail(resultSet.getString("email"));
				appointment.setTest(resultSet.getString("test"));
				appointment.setDate(resultSet.getString("date"));
				appointment.setTime(resultSet.getString("time"));
				appointment.setPsid(resultSet.getString("psid"));
			}
			
			System.out.println("--correct find by pk appointment");
			return appointment;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk appointment. " + e.getMessage());
			return null;
		}
	}
	
	public static void update(Appointment appointment) {
		sql = "UPDATE appointment SET fname=?, lname=?, mi=?, age=?, gender=?, mobile=?, email=?, test=?, date=?, time=?, pasid=? WHERE id=?";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, appointment.getFname());
			 preparedStatement.setString(2, appointment.getLname());
			 preparedStatement.setString(3, appointment.getMi());
			 preparedStatement.setString(4, appointment.getAge());
			 preparedStatement.setString(5, appointment.getGender());
			 preparedStatement.setString(6, appointment.getMobile());
			 preparedStatement.setString(7, appointment.getEmail());
			 preparedStatement.setString(8, appointment.getTest());
			 preparedStatement.setString(9, appointment.getDate());
			 preparedStatement.setString(10, appointment.getTime());
			 preparedStatement.setString(11, appointment.getPsid());
			 preparedStatement.setInt(12, appointment.getId());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct update on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect update on database. " + e.getMessage());
		 }
	}

}
