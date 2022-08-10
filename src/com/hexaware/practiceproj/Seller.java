package com.hexaware.practiceproj;

public class Seller {
	private int sid;
	private String sname;
	private String semail;
	private String slocation;
	
	public Seller(int sid, String sname, String semail, String slocation) {
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.slocation = slocation;
	}
	public int getId() {
		return sid;
	}
	public void setId(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return sname;
	}
	public void setName(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return semail;
	}
	public void setEmail(String semail) {
		this.semail = semail;
	}
	public String getLocation() {
		return slocation;
	}
	public void setLocation(String slocation) {
		this.slocation = slocation;
	}
	
	public String toString() {
		return "Seller Id - " + sid +
				", Seller Name - " + sname + 
				", Seller Email - " + semail + 
				", Seller Location - " + slocation;
	}
	
}



