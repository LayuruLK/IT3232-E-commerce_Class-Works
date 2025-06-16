package lk.ac.vau.fas.ict.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lk.ac.vau.fas.ict.models.Book;
import lk.ac.vau.fas.ict.models.Borrow;
import lk.ac.vau.fas.ict.models.Student;
import lk.ac.vau.fas.ict.repository.BookRepository;
import lk.ac.vau.fas.ict.repository.BorrowRepository;
import lk.ac.vau.fas.ict.repository.StudentRepository;

@Service
public class BorrowService {
    @Autowired
    public BorrowRepository borrowRepository;

    @Autowired
    public BookRepository bookRepository;

    @Autowired
    public StudentRepository studentRepository;

    // Add a new Borrow Entry
    public Borrow addNewEntry(Borrow borrow) {
       Book book = bookRepository.findById(borrow.getBook().getId()).orElseThrow(() -> new EntityNotFoundException("Book Not Found"));

       Student student = studentRepository.findById(borrow.getStudent().getId()).orElseThrow(()-> new EntityNotFoundException("Student Not Found"));

       borrow.setBook(book);
       borrow.setStudent(student);
    try{
        return borrowRepository.save(borrow);
    }catch(DataIntegrityViolationException e) {
        throw new DataIntegrityViolationException("Duplicate Key");
    }

    }
}
