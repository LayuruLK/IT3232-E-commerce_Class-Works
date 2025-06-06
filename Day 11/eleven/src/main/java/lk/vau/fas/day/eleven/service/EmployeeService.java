package lk.vau.fas.day.eleven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.vau.fas.day.eleven.model.Employee;
import lk.vau.fas.day.eleven.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    public EmployeeRepository employeeRepository;

    //find the employees with the salary range 70000 to 90000
    public List<Employee> getEmployeesbetweenSalary(int s,int e) {
        return employeeRepository.findSalaryRange(s, e);
    }
}
