# Expense Tracker API

A simple **Spring Boot REST API** for tracking expenses.  
This project is built as a backend-only application using **Spring Boot**, **MySQL**, and **Spring Data JPA**. It follows a layered architecture with controller, service, repository, entity, and global exception handling.

---

## Features

- Create a new expense
- View all expenses
- View expense by ID
- Update an expense
- Delete an expense
- Input validation
- Global exception handling
- MySQL database integration
- RESTful API design
- Clean layered architecture
- Ready to be extended into a frontend or mobile app later

---

## Tech Stack

- **Java 17**
- **Spring Boot 3.3.2**
- **Spring Web**
- **Spring Data JPA**
- **Spring Validation**
- **MySQL**
- **Maven**

---

## Project Structure

text
src/main/java/com/expensetracker
├── controller
│ └── ExpenseController.java
├── dto
├── entity
│ └── Expense.java
├── exception
│ ├── GlobalExceptionHandler.java
│ └── ResourceNotFoundException.java
├── repository
│ └── ExpenseRepository.java
├── service
│ └── ExpenseService.java
└── ExpenseTrackerApiApplication.java
src/main/resources
└── application.properties
src/test/java/com/expensetracker
└── ExpenseTrackerApiApplicationTests.java

---

## Setup Instructions

### Prerequisites

- Java 17 or higher
- Maven
- MySQL

### 1. Clone the repository

bash
git clone https://github.com/DryRunDemon/expense-tracker-api.git
cd expense-tracker-api

### 2. Create the database

Create a MySQL database named:

### 3. Configure database connection

Update `src/main/resources/application.properties`:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.open-in-view=false

### 4. Run the applicationbash

mvn spring-boot:run

### 5. Build the projectbash

## mvn clean install

## API Endpoints

Base URL:text
/api/v1/expenses

### Create Expensehttp

POST /api/v1/expenses

### Get All Expenseshttp

GET /api/v1/expenses

### Get Expense by IDhttp

GET /api/v1/expenses/{id}

### Update Expensehttp

PUT /api/v1/expenses/{id}

### Delete Expensehttp

## DELETE /api/v1/expenses/{id}

## Example Expense JSONjson

{
"title": "Lunch",
"amount": 250,
"category": "Food",
"expenseDate": "2026-07-14",
"description": "Lunch with friends"
}

---

## Future Improvements

- Add JWT authentication
- Add user registration and login
- Add Swagger/OpenAPI documentation
- Add filtering by category and date
- Add pagination and sorting
- Add Docker support
- Connect frontend or mobile app

---

## Author

**Mohamed Hameem Sajith J**  
GitHub: [DryRunDemon](https://github.com/DryRunDemon)
