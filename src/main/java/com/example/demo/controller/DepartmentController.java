package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService deptService;

    @PostMapping("/depts")
    public Department addDept(@RequestBody Department dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/depts")
    public List<Department> getAllDept(){
        return deptService.getAllDept();
    }

    @DeleteMapping("/depts/{deptId}")
    public String deleteDept(@PathVariable Long deptId){
        return deptService.deleteDept(deptId);
    }

    @GetMapping("/depts/{deptId}")
    public Optional<Department> fetchDeptById(@PathVariable Long deptId){
        return deptService.fetchDeptById(deptId);
    }

    @PutMapping("/depts/{deptId}")
    public Department updateDept(@RequestBody Department dept, @PathVariable Long deptId){
       return deptService.updateDept(dept,deptId);
    }

}