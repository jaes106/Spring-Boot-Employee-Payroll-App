package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.EmployeePayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService service;

    @PostMapping("/create")
    public EmployeePayrollData create(@Valid @RequestBody EmployeePayrollDTO dto) {
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public EmployeePayrollData getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollData update(@PathVariable int id,
                                      @Valid @RequestBody EmployeePayrollDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted employee with id " + id;
    }

    @GetMapping("/all")
    public List<EmployeePayrollData> getAll() {
        return service.getAll();
    }
}