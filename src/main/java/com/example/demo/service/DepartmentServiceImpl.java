package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepo deptRepo;

	@Override
	public Department addDept(Department dept) {
		return deptRepo.save(dept);
	}

	@Override
	public List<Department> getAllDept() {
		return deptRepo.findAll();
	}
}
