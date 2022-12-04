package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentService {

	public Department addDept(Department dept);

	public List<Department> getAllDept();

	public Department getById(Long deptId);

	public String deleteDept(Long deptId);

	public Department fetchByDeptCode(String deptCode);

}
