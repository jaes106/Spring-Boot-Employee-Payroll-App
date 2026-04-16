package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService service;

    @GetMapping("/")
    public String getMessage() {
        return "Employee Payroll App is Running";
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@RequestBody EmployeePayrollDTO dto) {
        return service.create(dto);
    }

    // OPTIONAL (to verify list storage)
    @GetMapping("/all")
    public List<EmployeePayrollData> getAll() {
        return service.getAll();
    }
}