package lk.ac.vau.fas.ict.first.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.first.Model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/app")
public class AppController {

    // Create some Student objects
    Student Bob = new Student("2021ICT01", "Bob Marely", 23, "IT", 3.21);
    Student Amal = new Student("2020ICT02", "Amal Perera", 24, "AMC", 3.41);
    Student Kamal = new Student("2022ICT03", "Kamal Gunasinghe", 22, "AMC", 2.91);
    Student Layuru = new Student("2020ICT22", "Layuru Lakvidu", 22, "IT", 3.57);
    
    private static List<Student> students = new ArrayList<Student>();
    private Map<String, Student> mstudents = new HashMap<String, Student>();

    public AppController() {
        students.add(Bob);
        students.add(Amal);
        students.add(Kamal);

        mstudents.put(Bob.getRegNo(), Bob);
        mstudents.put(Amal.getRegNo(), Amal);
        mstudents.put(Kamal.getRegNo(), Kamal);
        mstudents.put(Layuru.getRegNo(), Layuru);
    }

    // A method to return a student
    @GetMapping("/student")
    public Student getStudent() {
        return Bob;
    }

    // return multiple student
    @GetMapping("/all-students")
    public List<Student> getAll() {
        return students;
    }

    // Find a Student from the list by regNo
    @GetMapping("/student/{regno}")
    public Student getStudent(@PathVariable("regno") String regNo) {
        for (Student student : students) {
            if (student.getRegNo().equals(regNo)) {
                return student;
            }
        }
        return null;
    }

    // Find the students who age is between 20 and 23
    @GetMapping("/student/by-age")
    public List<Student> getStudentByAge() {
        List<Student> stu = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getAge() > 20 && student.getAge() < 23) {
                stu.add(student);
            }
        }
        return stu;
    }

    // sort the students by their GPA
    @GetMapping("/order/all-students")
    public List<Student> getAllStudents() {
        students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        return students;
    }

    // add Student
    @PostMapping("/student/add")
    public List<Student> addStudent(@RequestBody Student student) {
        students.add(student);
        return students;
    }

    //Add a new Student using mstudents
    @PostMapping("/add")
    public String addNewStudent(@RequestBody Student student) {
        mstudents.put(student.getRegNo(), student);
        return "New Student Added";
    }

    //Delete the student in Map
    @DeleteMapping("/student/{id}")
    public String DeleteAStudent(@PathVariable("id") String regNo) {
        if(mstudents.get(regNo) != null) {
            mstudents.remove(regNo);
            return "Student with regNo " + regNo + " has been deleted.";
        }
        return "404 Couldn't find the student";
    }

    //Update the Student in Map
    @PutMapping("/student/{id}")
    public String updateAStudent(@PathVariable("id") String regno, @RequestBody Student student) {
        if(mstudents.get(regno) != null) {
			mstudents.put(student.getRegNo(), student);
			return "The Student Details Updated";
		}
		return "404 Couldn't find the student";
    }
    

    // Update student by regNo
    @PutMapping("/student/update/{regno}")
    public Student updateStudent(@PathVariable("regno") String regNo, @RequestBody Student updatedStudent) {

        for (Student student : students) {
            if (student.getRegNo().equals(regNo)) {
                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());
                student.setCourse(updatedStudent.getCourse());
                student.setGpa(updatedStudent.getGpa());
                return student;
            }
        }
        return null;
    }

    // Delete a student by registration number
    @DeleteMapping("/student/delete/{regno}")
    public String deleteStudent(@PathVariable("regno") String regNo) {
        for (Student student : students) {
            if (student.getRegNo().equals(regNo)) {
                students.remove(student);
                return "Student with regNo " + regNo + " has been deleted."; 
            }
        }
        return "Student with regNo " + regNo + " not found."; 
    }

    @GetMapping("/msg")
    public String myMessage() {
        return "Hello SpringBoot";
    }

    @GetMapping("/name")
    public String myName() {
        return "My name is SpringBoot";
    }

    @GetMapping("/age/{ag}")
    public String myAge(@PathVariable("ag") int age) {
        return "My age is " + age;
    }

    @GetMapping("/course/{uni}/{crs}")
    public String MyUni(@PathVariable("uni") String university, @PathVariable("crs") String course) {
        return "My university is " + university + " and my course is " + course;
    }

}
