package dao;

import java.util.List;

import model.Appointment;

public interface CRUD {
	
	public static void create(Appointment appointment) {};
	public static void delete(int appointmentId) {};
	public static List<Appointment> find(String search){return null;}
	public static Appointment findByPk(int appointmentId) {return null;}
	public static void update(Appointment appointment) {}
}