Sure! Here's a **README.md** template written in Markdown that describes the work you’ve done, including the API features for adding, deleting, and updating students, along with the screenshots you’ve mentioned.

---

```markdown
# Day 03 - Student Management API

This project implements a simple **Student Management API** using **Spring Boot**. It allows users to add, delete, and update student records in an in-memory map, along with the creation of a new **Course** model. The API operations are mapped to various HTTP methods, such as **POST**, **DELETE**, and **PUT**.

## Features

- **Add a New Student**: Adds a new student to the map.
- **Delete a Student**: Deletes a student from the map by registration number.
- **Update a Student**: Updates the details of an existing student by registration number.
- **Course Model**: A new model to store course-related data for students.

## API Endpoints

### 1. Add a New Student

- **URL**: `/student/add`
- **Method**: `POST`
- **Description**: Adds a new student to the map.
- **Request Body**:
  ```json
  {
    "regNo": "2023ICT01",
    "name": "John Doe",
    "age": 22,
    "course": "Computer Science",
    "gpa": 3.5
  }
  ```

- **Response**:
  ```plaintext
  New Student Added
  ```

#### Screenshot for Add Student:
![Add New Student](./Screenshots/One.png)

---

### 2. Delete a Student

- **URL**: `/student/{id}`
- **Method**: `DELETE`
- **Description**: Deletes a student from the map by their registration number (`id`).
- **Response**:
  - Success: `Student with regNo [regNo] has been deleted.`
  - Failure: `Student with regNo [regNo] not found.`

#### Screenshot for Delete Student:
![Delete Student](./Screenshots/Two.png)

---

### 3. Update a Student

- **URL**: `/student/{id}`
- **Method**: `PUT`
- **Description**: Updates an existing student’s details based on their registration number.
- **Request Body**:
  ```json
  {
    "regNo": "2023ICT01",
    "name": "John Doe Updated",
    "age": 23,
    "course": "Software Engineering",
    "gpa": 3.8
  }
  ```

- **Response**:
  - Success: `The Student Details Updated`
  - Failure: `Student with regNo [regNo] not found.`

#### Screenshot for Update Student:
![Update Student](./Screenshots/Three.png)

---
