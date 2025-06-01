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

    public Department addDepartment(Department department) {
        department.setDepId(null);
        return departmentRepo.save(department);
    }

    public Department updateDepartment(Long depId, Department updatedDepartment) {
        return departmentRepo.findById(depId).map(department -> {
            department.setDName(updatedDepartment.getDName());
            department.setLocation(updatedDepartment.getLocation());
            return departmentRepo.save(department);
        }).orElseThrow(() -> new RuntimeException("Department not found with id: " + depId));
    }

    public void deleteDepartmentById(Long depId) {
        if (!departmentRepo.existsById(depId)) {
            throw new RuntimeException("Department not found with id: " + depId);
        }
        departmentRepo.deleteById(depId);
    }
}
