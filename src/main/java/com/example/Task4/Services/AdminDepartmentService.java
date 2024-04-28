package com.example.Task4.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Task4.Entity.DepartmentStaffDetail;

@Service("AdminDepartment")
public class AdminDepartmentService implements DepartmentService {

	@Override
	public String getDepartmentName() {
		String Department = "ADMIN Department";
		return Department;
	}

	private static List<DepartmentStaffDetail> list = new ArrayList<>();

	static {
		list.add(new DepartmentStaffDetail(1, "Kamal", "Male"));
		list.add(new DepartmentStaffDetail(2, "Kannan", "Male"));
		list.add(new DepartmentStaffDetail(3, "Tiyasha", "Female"));
	}

	@Override
	public List<DepartmentStaffDetail> listAll() {
		return list;
	}
}
