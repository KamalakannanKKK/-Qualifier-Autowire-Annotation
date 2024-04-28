package com.example.Task4.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Task4.Entity.DepartmentStaffDetail;

@Service("HRDepartment")
public class HRDepartmentService implements DepartmentService {

	@Override
	public String getDepartmentName() {
		String Department="Human Resource Department";
		return Department;
	}
	
	private static List<DepartmentStaffDetail> list = new ArrayList<>();

	static {
		list.add(new DepartmentStaffDetail(1, "Ajay", "Male"));
		list.add(new DepartmentStaffDetail(2, "Dev", "Male"));
		list.add(new DepartmentStaffDetail(3, "Ramya", "Female"));
	}


	@Override
	public List<DepartmentStaffDetail> listAll() {
	  return list;
	}

}
