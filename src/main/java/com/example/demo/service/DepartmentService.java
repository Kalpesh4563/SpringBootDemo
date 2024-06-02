package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Department;

public interface DepartmentService {

	Department addDept(Department dept);

	List<Department> getAllDept();

	String deleteDept(Long deptId);

	Optional<Department> fetchDeptById(Long deptId);

	Department updateDept(Department dept, Long deptId);
}
