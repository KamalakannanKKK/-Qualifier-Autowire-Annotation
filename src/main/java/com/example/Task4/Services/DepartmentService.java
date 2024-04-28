package com.example.Task4.Services;

import java.util.List;

import com.example.Task4.Entity.DepartmentStaffDetail;

public interface DepartmentService {

	public String getDepartmentName();
	
	public List<DepartmentStaffDetail> listAll();
}
