package com.soft.employeeservice.service;

import com.soft.employeeservice.dto.DepartmentDTO;
import com.soft.employeeservice.dto.ResponseDTO;
import com.soft.employeeservice.entity.Employee;
import com.soft.employeeservice.repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final RestTemplate restTemplate;
    public EmployeeService(EmployeeRepository employeeRepository, RestTemplate restTemplate) {
        this.employeeRepository = employeeRepository;
        this.restTemplate = restTemplate;
    }
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public ResponseDTO getEmployeeById(Integer id){
        Employee employee = employeeRepository.getReferenceById(id);
        ResponseEntity<DepartmentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/departments/"+employee.getDepartmentId(), DepartmentDTO.class);
        DepartmentDTO departmentDTO = responseEntity.getBody();
        ResponseDTO resp = new ResponseDTO();
        resp.setEmployee(employee);
        resp.setDepartmentDTO(departmentDTO);
        return resp;
    }
}
