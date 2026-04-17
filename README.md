# Employee Payroll Application

## Project Overview
The Employee Payroll Application is a RESTful Spring Boot project developed to manage employee payroll data.  
It demonstrates a layered architecture (Controller → Service → Model) and gradually builds features across multiple use cases (UCs).

The application starts with basic REST endpoints and evolves to include validation, logging, exception handling, and structured error responses.

---

## Architecture
The project follows a clean layered architecture:

- Controller Layer → Handles HTTP requests and responses  
- Service Layer → Contains business logic  
- DTO Layer → Handles input data transfer and validation  
- Model Layer → Represents internal data structure  
- Exception Layer → Handles global and custom exceptions  

---

## Tech Stack

- Java  
- Spring Boot  
- Spring Web MVC  
- Jakarta Validation  
- Lombok  
- Maven  

---

## Use Cases Implemented

### UC1 – Basic REST Controller
- Create a simple REST endpoint to verify application is running.
- Endpoint: GET /employeepayrollservice/

---

### UC2 – Controller with CRUD Endpoints
- Implement REST APIs for:
  - Create employee
  - Get employee(s)
  - Update employee
  - Delete employee
- Logic handled directly in controller (initial stage).

---

### UC3 – DTO and Model Introduction
- Introduced EmployeePayrollDTO for request handling.
- Introduced EmployeePayrollData as internal model.
- Separation of API input and internal representation.

---

### UC4 – Service Layer Implementation
- Moved business logic from Controller to Service layer.
- Controller now delegates operations to Service.

---

### UC5 – In-Memory Storage
- Employee data stored in a local List.
- Enabled full CRUD operations without database dependency.

---

### UC7 – Logging using Lombok
- Integrated logging using @Slf4j.
- Logged key operations like create, fetch, update.

---

### UC8 – Logging Configuration with Profiles
- Configured logging levels and patterns.
- Introduced environment-specific configurations (dev/prod).

---

### UC9 – Environment-Based Configuration
- Externalized configuration using environment variables.
- Prepared application for database integration.

---

### UC10 – Input Validation
- Added validation using Jakarta Validation:
  - @NotEmpty
  - @Pattern
- Applied validation to Create and Update APIs.

---

### UC11 – Global Exception Handling
- Implemented @RestControllerAdvice.
- Handled validation errors using:
  - MethodArgumentNotValidException
- Returned user-friendly error responses.

---

### UC12 – Custom Exception Handling
- Created EmployeePayrollException.
- Thrown when employee ID is not found.
- Handled globally using @ExceptionHandler.
- Returned meaningful error messages to users.

---

## Sample API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /employeepayrollservice/ | Check app status |
| POST | /employeepayrollservice/create | Create employee |
| GET | /employeepayrollservice/{id} | Get employee by ID |
| GET | /employeepayrollservice/all | Get all employees |
| PUT | /employeepayrollservice/update/{id} | Update employee |
| DELETE | /employeepayrollservice/delete/{id} | Delete employee |

---

## Key Learnings

- Layered architecture in Spring Boot  
- REST API design principles  
- DTO vs Model separation  
- Input validation using annotations  
- Global exception handling  
- Custom exception design  
- Logging and environment configuration  

---

## Future Enhancements

- Integrate database using Spring Data JPA  
- Add repository layer  
- Implement authentication and authorization  
- Improve response structure using custom response DTOs  
