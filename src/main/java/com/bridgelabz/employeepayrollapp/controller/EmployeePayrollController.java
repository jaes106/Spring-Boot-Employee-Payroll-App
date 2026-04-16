package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {


    @GetMapping("/")
    public String getMessage() {
        return "Employee Payroll App is Running";
    }


    @GetMapping("/get/{id}")
    public String getEmployee(@PathVariable int id) {
        return "Get Employee with ID: " + id;
    }


    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@RequestBody EmployeePayrollDTO dto) {
        return new EmployeePayrollData(1, dto);
    }


    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id,
                                 @RequestBody String body) {
        return "Updated Employee " + id + " with data: " + body;
    }


    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Deleted Employee with ID: " + id;
    }
}