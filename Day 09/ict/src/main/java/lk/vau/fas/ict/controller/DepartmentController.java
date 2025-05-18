package lk.vau.fas.ict.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.vau.fas.ict.model.Department;
import lk.vau.fas.ict.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    
    @Autowired
    public DepartmentService service;

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartments() {
        return new ResponseEntity<List<Department>>
        (service.getAllDepartments(),HttpStatus.OK);
    }

    @GetMapping("/{depId}")
    public ResponseEntity<?> getDepartmentById(@PathVariable Long depId) {
        Optional<Department> department = service.getDepartmentById(depId);

        if(department.isPresent()) {
            return new ResponseEntity<>(department.get(),HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Department not found with id: " + depId, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> addDepartment(@RequestBody Department department) {
        department.setDepId(null);
        Department createDept = service.addDepartment(department);
        return new ResponseEntity<>(createDept,HttpStatus.CREATED);
    }
}
