package lk.vau.fas.ict.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.vau.fas.ict.model.Department;
import lk.vau.fas.ict.repo.DepartmentRepo;

@Service
public class DepartmentService {

    private final DepartmentRepo departmentRepo;

    @Autowired
    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    public Optional<Department> getDepartmentById(Long depId) {
        return departmentRepo.findById(depId);
    }

}
