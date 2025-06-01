# 🏢 Department Management System (Spring Boot + JPA) - Day 09

This is a simple **Department Management System** built using **Spring Boot** and **Spring Data JPA**. The application manages departments and their associated employees, providing RESTful APIs to perform **CRUD operations** on departments.

It follows a clean **MVC architecture**, separating concerns across **Models**, **Repositories**, **Services**, and **Controllers**.

---

## 📌 Features

- Add, update, delete, and view departments
- Each department can contain multiple employees (One-To-Many relationship)
- Structured and layered Spring Boot project
- JPA for ORM with PostgreSQL/MySQL/H2 compatibility
- JSON serialization/deserialization with proper reference handling

---

## 🛠️ Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **Jackson (for JSON handling)**
- **Maven**
- **MySQL/PostgreSQL/H2 (you can configure any)**

---

## 📁 Project Structure

```

src/
├── controller/
│   └── DepartmentController.java
├── model/
│   ├── Department.java
│   └── Employee.java
├── repo/
│   └── DepartmentRepo.java
├── service/
│   └── DepartmentService.java
└── Application.java

````

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/LayuruLK/IT3232-E-commerce_Class-Works/edit/main/Day%2009/
cd ict
````

### 2. Configure `application.properties`

Update your `src/main/resources/application.properties` with your database settings:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/company
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the application

```bash
./mvnw spring-boot:run
```

App will run on: `http://localhost:8080`

---

## 📡 API Endpoints

| Method | Endpoint               | Description                |
| ------ | ---------------------- | -------------------------- |
| GET    | `/dept/all`            | Get all departments        |
| GET    | `/dept/{depId}`        | Get department by ID       |
| POST   | `/dept/add`            | Add a new department       |
| PUT    | `/dept/update/{depId}` | Update existing department |
| DELETE | `/dept/delete/{depId}` | Delete department by ID    |

---

## 📸 Screenshots

| Action              | Image                                 |
| ------------------- | ------------------------------------- |
| Add Department      | ![Add](screenshots/add.png)           |
| Get All Departments | ![Get All](screenshots/getall.png)    |
| Get By ID           | ![Get By ID](screenshots/getbyid.png) |
| Update Department   | ![Update](screenshots/update.png)     |
| Delete Department   | ![Delete](screenshots/delete.png)     |

---

## 🧠 Data Relationships

* A **Department** has multiple **Employees**
* Mapped using `@OneToMany` and `@ManyToOne`
* JSON references managed via `@JsonManagedReference` and `@JsonBackReference` to avoid infinite loops

---

## 🗂️ Future Improvements

* Add full CRUD for `Employee` entity
* Integrate Swagger UI for API documentation
* Add pagination and filtering
* Add authentication & authorization

---

## 🧑‍💻 Author

**LayuruLK**
📧 [layurulakvidukarunathilaka@gmail.com](mailto:your.layurulakvidukarunathilaka@gmail.com)
🔗 [LinkedIn](https://linkedin.com/in/layuru-k-02b345245) | [GitHub](https://github.com/LayuruLK)

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
