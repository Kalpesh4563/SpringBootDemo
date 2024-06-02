package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

	@Override
	public String deleteDept(Long deptId) {
		deptRepo.deleteById(deptId);
		return "Department deleted successfully !";
	}

	@Override
	public Optional<Department> fetchDeptById(Long deptId) {
		return deptRepo.findById(deptId);
	}

	@Override
	public Department updateDept(Department department, Long deptId) {

		Department deptDb = deptRepo.findById(deptId).get();

		if(Objects.nonNull(department.getDeptName()) && !"".equalsIgnoreCase(department.getDeptName())){
			deptDb.setDeptName(department.getDeptName());
		}

		if(Objects.nonNull(department.getDeptAddress()) && !"".equalsIgnoreCase(department.getDeptAddress())){
			deptDb.setDeptAddress(department.getDeptAddress());
		}

		if(Objects.nonNull(department.getDeptCode()) && !"".equalsIgnoreCase(department.getDeptCode())){
			deptDb.setDeptCode(department.getDeptCode());
		}
		return deptRepo.save(deptDb);
	}


}
