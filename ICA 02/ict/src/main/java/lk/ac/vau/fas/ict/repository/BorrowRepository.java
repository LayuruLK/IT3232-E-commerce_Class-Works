package lk.ac.vau.fas.ict.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.fas.ict.models.Borrow;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Integer>{
    
}
