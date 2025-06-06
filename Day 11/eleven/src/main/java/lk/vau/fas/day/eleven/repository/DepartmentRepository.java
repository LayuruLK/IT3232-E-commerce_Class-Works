package lk.vau.fas.day.eleven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.vau.fas.day.eleven.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
        
    
} 