package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService {

    private List<EmployeePayrollData> list = new ArrayList<>();
    private int idCounter = 1;

    public EmployeePayrollData create(EmployeePayrollDTO dto) {
        EmployeePayrollData emp = new EmployeePayrollData(idCounter++, dto);
        list.add(emp);
        return emp;
    }

    public List<EmployeePayrollData> getAll() {
        return list;
    }

    public EmployeePayrollData getById(int id) {
        return list.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElseThrow(() ->
                        new EmployeePayrollException("Employee not found with id: " + id));
    }

    public EmployeePayrollData update(int id, EmployeePayrollDTO dto) {
        EmployeePayrollData emp = getById(id);
        emp.setName(dto.getName());
        emp.setSalary(dto.getSalary());
        return emp;
    }

    public void delete(int id) {
        EmployeePayrollData emp = getById(id);
        list.remove(emp);
    }
}