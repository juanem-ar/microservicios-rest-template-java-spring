package com.soft.departamentservice.controller;

import com.soft.departamentservice.entity.Departament;
import com.soft.departamentservice.service.DepartamentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartamentController {
    private final DepartamentService departamentService;

    public DepartamentController(DepartamentService departamentService) {
        this.departamentService = departamentService;
    }

    @PostMapping
    public Departament saveDepartment(@RequestBody Departament departament){
        return departamentService.createDepartament(departament);
    }

    @GetMapping("/{id}")
    public Departament getDepartmentByIf(@PathVariable Integer id){
        return departamentService.getDepartamentById(id);
    }

    @GetMapping
    public List<Departament> getAllDepartments(){
        return departamentService.getAllDepartaments();
    }
}
