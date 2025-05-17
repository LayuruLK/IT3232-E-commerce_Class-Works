package lk.vau.fas.ict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
