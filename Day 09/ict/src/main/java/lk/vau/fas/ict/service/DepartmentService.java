package lk.vau.fas.ict.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import lk.vau.fas.ict.model.Department;
import lk.vau.fas.ict.repo.DepartmentRepo;

public class DepartmentService {
    private DepartmentRepo departmentRepo;

    //Get All Departments
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll(); 
    }
}
