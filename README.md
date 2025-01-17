## **Employee Management System**

### **Description**
The Employee Management System is a Spring Boot application that provides RESTful APIs for managing employees. The project uses Spring Data JPA for database operations and can perform CRUD (Create, Read, Update, Delete) operations on employee records.

---

### **Features**
- Add new employees.
- View all employees.
- Update employee details.
- Delete employees.
- Search employees by name, ID, or other parameters.

---

### **Technologies Used**
- **Spring Boot** - Framework for building the application.
- **Spring Data JPA** - For ORM and database operations.
- **Hibernate** - JPA implementation.
- **H2 Database** - In-memory database (can be replaced with MySQL, PostgreSQL, etc.).
- **Maven** - Build automation tool.
- **Java** - Programming language.
- **Postman** - For testing APIs (optional).

---

### **Requirements**
- Java 17 or higher
- Maven 3.6+
- IDE (e.g., Eclipse, IntelliJ IDEA)
- Git
- H2 Database (or any relational database)

---

### **Installation Instructions**
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/employee-management-system.git
   ```
   
2. **Navigate to the Project Directory**:
   ```bash
   cd employee-management-system
   ```

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```
   The application will start at `http://localhost:8080`.

---

### **Endpoints**

| HTTP Method | Endpoint          | Description                     |
|-------------|-------------------|---------------------------------|
| GET         | /employees        | Get all employees               |
| GET         | /employees/{id}   | Get employee by ID              |
| POST        | /employees        | Add a new employee              |
| PUT         | /employees/{id}   | Update an existing employee     |
| DELETE      | /employees/{id}   | Delete an employee              |

---

### **Database Configuration**
- The application uses H2 as the default database.
- You can access the H2 console at `http://localhost:8080/h2-console`.

Default H2 credentials:
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: `password`

If using a different database, update the `application.properties` file:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

---

### **Sample JSON Request**
**Add Employee:**
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "department": "Engineering",
  "salary": 75000
}
```

---

### **Run Tests**
To run the unit tests for the application:
```bash
mvn test
```

---

### **Contributing**
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature/bugfix.
3. Commit your changes.
4. Push the branch and create a pull request.

---

### **Author**
**Your Name**  
- GitHub: [cfrohes](https://github.com/cfrohes)  
- Email: chandanshangami@gmail.com
