package com.Enoca.companyDemo.controllers;

import com.Enoca.companyDemo.dtos.EmployeeDto;
import com.Enoca.companyDemo.serviceImpls.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/create")
    public void create(EmployeeDto employeeDto) {
        employeeService.create(employeeDto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        employeeService.delete(id);
    }

    @PostMapping("/update/{id}")
    public void update(EmployeeDto employeeDto, Long id) {
        employeeService.update(employeeDto,id);
    }
    @GetMapping("/allEmployee")
    public ResponseEntity<List<EmployeeDto>> showAll(){
        return ResponseEntity.ok(employeeService.getAll());
    }
    }

