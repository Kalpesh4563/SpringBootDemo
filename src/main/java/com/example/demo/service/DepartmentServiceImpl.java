package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepo deptRepo;
	
	@Override
	public Department addDept(Department dept) {
		return deptRepo.save(dept);
	}

	@Override
	public List<Department> getAllDept() {
		return deptRepo.findAll();
	}

	@Override
	public Department getById(Long deptId) {
		return deptRepo.findById(deptId).get();
	}

	@Override
	public String deleteDept(Long deptId) {
		deptRepo.deleteById(deptId);
		return "Deleted Successfully.....";
	}

	@Override
	public Department fetchByDeptCode(String deptCode) {
		return deptRepo.findBydeptCodeIgnoreCase(deptCode);
	}

}
