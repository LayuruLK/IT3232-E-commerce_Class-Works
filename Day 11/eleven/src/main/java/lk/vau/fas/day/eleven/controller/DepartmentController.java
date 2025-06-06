package lk.vau.fas.day.eleven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.vau.fas.day.eleven.model.Department;
import lk.vau.fas.day.eleven.repository.DepartmentRepository;
import lk.vau.fas.day.eleven.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    
    @Autowired
    public DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments(){
        return new ResponseEntity<List<Department>>
        (departmentService.getAllDepartments(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") int id) {
        return  new ResponseEntity<Department>
        (departmentService.getDepartmentById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addNewDepartment(@RequestBody Department department) {
        return new ResponseEntity<String>(departmentService.addDepartment(department),HttpStatus.OK);
    }

}
