package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentService {

	Department addDept(Department dept);

	List<Department> getAllDept();
}
