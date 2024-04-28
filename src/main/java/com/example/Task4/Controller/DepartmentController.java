package com.example.Task4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Task4.Entity.DepartmentStaffDetail;
import com.example.Task4.Services.DepartmentService;

@RestController
public class DepartmentController {

	
	@Autowired
	@Qualifier("HRDepartment")
	DepartmentService departmentService;
	
	@Autowired
	DepartmentStaffDetail departmentStaffDetail;
	
	@GetMapping("/getDepartment")
	public String getDepartmentName() {
		String DepartmentName=departmentService.getDepartmentName();
		return "Department Name : "+DepartmentName;
	}
	
	@GetMapping("/getStaffDetail")
	public List<DepartmentStaffDetail> getAllStaff(){
		return this.departmentService.listAll();
	}
}
