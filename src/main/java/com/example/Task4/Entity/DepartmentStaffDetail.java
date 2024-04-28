package com.example.Task4.Entity;

import org.springframework.stereotype.Component;

@Component
public class DepartmentStaffDetail {

	private int staffId;
	private String StaffName;
	private String Gender;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return StaffName;
	}
	public void setStaffName(String staffName) {
		StaffName = staffName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public DepartmentStaffDetail(int staffId, String staffName, String gender) {
		super();
		this.staffId = staffId;
		StaffName = staffName;
		Gender = gender;
	}
	public DepartmentStaffDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
