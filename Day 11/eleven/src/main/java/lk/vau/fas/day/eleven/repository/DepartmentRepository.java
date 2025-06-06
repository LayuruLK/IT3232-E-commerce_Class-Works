package lk.vau.fas.day.eleven.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.vau.fas.day.eleven.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
    
    @Query("select name from Department")
    public List<String> getDepartmentNames();
} 