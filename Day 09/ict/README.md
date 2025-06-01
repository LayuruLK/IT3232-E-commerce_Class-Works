# ⚠️ Spring Boot Exception Handling System

Welcome to the **Spring Boot Exception Handling System** — a clean and efficient RESTful API built with Java and Spring Boot. This project demonstrates **centralized exception handling** using `@RestControllerAdvice` with real-world examples involving departments and employees.

![Example Screenshot](screenshots/example.png)

---

## 🧠 Project Summary

This project shows how to gracefully handle runtime exceptions in a Spring Boot backend. Instead of sending confusing technical messages to API consumers, the system returns meaningful HTTP responses using custom error structures.

---

## 📌 Key Features

- ✅ Centralized exception handling with `@RestControllerAdvice`
- 🧩 Entity-relationship mapping using JPA and Hibernate
- 🚫 Handles `EntityNotFoundException` and `DuplicateKeyException`
- 🌐 RESTful endpoints for managing departments
- 📦 Clean architecture (Model → Repo → Service → Controller)
- 📋 Structured error responses (`ErrorResponse` class)

---

## 🧱 Tech Stack

| Technology | Description              |
|------------|--------------------------|
| Java       | Main programming language |
| Spring Boot| Framework for API building |
| JPA/Hibernate | ORM for database interaction |
| Maven      | Dependency management     |
| Jackson    | JSON serialization        |

---

## 🗂️ Project Structure

```bash
src/
└── main/
    └── java/
        └── lk/vau/fas/ict/
            ├── model/
            │   ├── Department.java
            │   ├── Employee.java
            │   └── ErrorResponse.java
            ├── repo/
            │   └── DepartmentRepo.java
            ├── service/
            │   └── DepartmentService.java
            ├── controller/
            │   └── DepartmentController.java
            └── exceptionHandler/
                └── GenericExceptionHandler.java
````

---

## 🔍 API Endpoints

### 📁 Department Endpoints

| Method | Endpoint            | Description             |
| ------ | ------------------- | ----------------------- |
| GET    | `/departments`      | Get all departments     |
| GET    | `/departments/{id}` | Get a department by ID  |
| DELETE | `/departments/{id}` | Delete department by ID |
| POST   | *(to be added)*     | Add a new department    |

### 🛑 Exception Types Handled

| Exception                 | HTTP Status Code          | Returned Message                         |
| ------------------------- | ------------------------- | ---------------------------------------- |
| `EntityNotFoundException` | 404 Not Found             | "Department Not Found"                   |
| `DuplicateKeyException`   | 400 Bad Request           | "The department id is already available" |
| `Exception` (generic)     | 500 Internal Server Error | *Root cause message*                     |

---

## 📦 Example Error Response (JSON)

```json
{
  "statusCode": 404,
  "errorMessage": "Department Not Found"
}
```

---

## 🚀 Getting Started

### ✅ Prerequisites

* Java 17+
* Maven 3.6+
* Spring Boot (v3+ recommended)
* MySQL/PostgreSQL (or any JPA-compatible DB)

### 📥 Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/spring-boot-exception-handling.git
   cd spring-boot-exception-handling
   ```

2. Configure `application.properties` with your database connection.

3. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Access endpoints via `http://localhost:8080/departments`

---

## 🧪 Example Screenshot

You can see how exceptions are handled in the following screenshot:

![Example](example.png)

---

## 🤝 Contribution

Feel free to fork, raise issues, or submit PRs if you'd like to improve this demo!

---

## 📝 License

This project is open-source and available under the [MIT License](LICENSE).

---

## 💬 Feedback

For improvements or suggestions, please open an issue or contact me directly.

```

---

Let me know if you'd like:
- A `Postman` collection file
- Sample data for testing
- Markdown badge decorations
- Or converting this into GitHub Pages or GitHub Wiki format

I'm happy to enhance it further!
```
