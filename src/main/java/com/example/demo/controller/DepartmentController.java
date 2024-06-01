package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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

}