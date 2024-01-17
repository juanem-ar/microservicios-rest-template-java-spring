package com.soft.employeeservice.controller;

import com.soft.employeeservice.dto.ResponseDTO;
import com.soft.employeeservice.entity.Employee;
import com.soft.employeeservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/{id}")
    public ResponseDTO getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
