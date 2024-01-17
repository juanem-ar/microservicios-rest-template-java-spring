package com.soft.departamentservice.service;

import com.soft.departamentservice.entity.Departament;
import com.soft.departamentservice.repository.DepartamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentService {
    private final DepartamentRepository departamentRepository;

    public DepartamentService(DepartamentRepository departamentRepository) {
        this.departamentRepository = departamentRepository;
    }

    public Departament createDepartament (Departament departament){
        return departamentRepository.save(departament);
    }
    public Departament getDepartamentById(Integer id){
        return departamentRepository.findById(id).get();
    }
    public List<Departament> getAllDepartaments(){
        return departamentRepository.findAll();
    }
}
