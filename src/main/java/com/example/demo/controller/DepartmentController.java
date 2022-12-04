package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	@PostMapping("/add")
	public Department addDept(@RequestBody Department dept) {
		return deptService.addDept(dept);
	}
	
	@GetMapping("/getAll")
	public List<Department> getAllDept(){
		return deptService.getAllDept();
	}
	
	@GetMapping("/{id}")
	public Department getByIdt(@PathVariable("id") Long deptId){
		return deptService.getById(deptId);
	}
	
	@DeleteMapping("/{id}")
	public String deleteDept(@PathVariable("id") Long deptId){
		return deptService.deleteDept(deptId);
	}
	
	@GetMapping("/")
	public String home() {
		return "Response updated........";
	}
	
	@GetMapping("/deptCode/{deptCode}")
	public Department fetchByDeptCode(@PathVariable("deptCode") String deptCode) {
		return deptService.fetchByDeptCode(deptCode);
	}
}
