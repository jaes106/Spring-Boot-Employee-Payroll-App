package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class EmployeePayrollDTO {

    @NotEmpty(message = "Employee name should not be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$",
            message = "Name must start with capital letter and have minimum 3 characters")
    private String name;

    private double salary;
}