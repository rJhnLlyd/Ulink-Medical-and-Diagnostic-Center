package model;

public class Appointment{
	
	private int id;
	private String fname;
	private String lname;
	private String mi;
	private String age;
	private String gender;
	private String mobile;
	private String email;
	private String test;
	private String date;
	private String time;
	private String psid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMi() {
		return mi;
	}
	public void setMi(String mi) {
		this.mi = mi;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPsid() {
		return psid;
	}
	public void setPsid(String psid) {
		this.psid = psid;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", fname=" + fname + ",lname=" + lname + ",mi=" + mi + ", age=" + age + ", gender=" + gender + ", mobile="
				+ mobile + ", email=" + email + ", test=" + test + ", date=" + date + ", time=" + time + ", psid=" + psid + "]";
	}
	
	
}