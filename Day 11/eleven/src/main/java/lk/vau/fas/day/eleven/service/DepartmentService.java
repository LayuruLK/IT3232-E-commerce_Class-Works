package lk.vau.fas.day.eleven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lk.vau.fas.day.eleven.model.Department;
import lk.vau.fas.day.eleven.repository.DepartmentRepository;

@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepository departmentRepository;

    //Get All departments
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    //Get Department by ID
    public Department getDepartmentById(int id){
        if (departmentRepository.findById(id).isEmpty()) {
            throw new EntityNotFoundException("Department Not Found");
        }
        return departmentRepository.findById(id).get();
    }


}
