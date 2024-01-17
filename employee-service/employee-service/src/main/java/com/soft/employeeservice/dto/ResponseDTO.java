package com.soft.employeeservice.dto;

import com.soft.employeeservice.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private Employee employee;
    private DepartmentDTO departmentDTO;
}
