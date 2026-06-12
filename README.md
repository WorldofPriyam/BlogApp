# 🚀 BlogApp - Spring Boot REST API

<div align="center">

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.2-brightgreen)
![Java](https://img.shields.io/badge/Java-17-orange)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![JWT](https://img.shields.io/badge/JWT-Authentication-red)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-success)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-C71A36)

A complete Blog Application REST API built using Spring Boot, Spring Security, JWT Authentication, JPA, MySQL, and Swagger Documentation.

</div>

---

# 📖 Overview

**BlogApp** is a production-ready REST API that provides a complete blogging platform backend.

The application supports:

- 🔐 JWT Authentication & Authorization
- 👤 User Management
- 📝 Blog Post Management
- 🏷️ Category Management
- 💬 Comment System
- 📄 Pagination & Sorting
- 📚 API Documentation using Swagger/OpenAPI
- 🗄️ MySQL Database Integration
- 🔄 DTO Mapping using ModelMapper
- ✅ Request Validation

---

# 🛠️ Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17 |
| Spring Boot | 3.1.2 |
| Spring Security | Latest |
| Spring Data JPA | Latest |
| MySQL | Latest |
| JWT | 0.11.5 |
| Swagger OpenAPI | 2.1.0 |
| Lombok | Latest |
| ModelMapper | 2.3.9 |
| Maven | Latest |

---

# 📂 Project Structure

```text
src
 ┣ 📂 main
 ┃ ┣ 📂 java
 ┃ ┃ ┗ 📂 com.blogapp
 ┃ ┃   ┣ 📂 config
 ┃ ┃   ┣ 📂 controller
 ┃ ┃   ┣ 📂 dto
 ┃ ┃   ┣ 📂 entity
 ┃ ┃   ┣ 📂 exception
 ┃ ┃   ┣ 📂 payloads
 ┃ ┃   ┣ 📂 repository
 ┃ ┃   ┣ 📂 security
 ┃ ┃   ┣ 📂 service
 ┃ ┃   ┗ 📂 service.impl
 ┃ ┗ 📂 resources
 ┃   ┣ application.properties
 ┃   ┗ static
 ┗ 📂 test
```

---

# ✨ Features

## 🔐 Authentication

- User Registration
- User Login
- JWT Token Generation
- Protected APIs
- Role-Based Authorization

### Authentication Flow

```text
User Login
      │
      ▼
Spring Security
      │
      ▼
JWT Generated
      │
      ▼
Client Stores Token
      │
      ▼
Protected API Access
```

---

## 👤 User Module

### Available Operations

- Create User
- Update User
- Delete User
- Get User By ID
- Get All Users

---

## 📝 Post Module

### Available Operations

- Create Post
- Update Post
- Delete Post
- Get Post By ID
- Get All Posts
- Get Posts By User
- Get Posts By Category
- Search Posts

---

## 🏷️ Category Module

### Available Operations

- Create Category
- Update Category
- Delete Category
- Get Category By ID
- Get All Categories

---

## 💬 Comment Module

### Available Operations

- Add Comment
- Delete Comment
- Get Comments For Post

---

# Screenshots

<img width="1124" height="609" alt="Screenshot 2023-08-05 045020" src="https://github.com/user-attachments/assets/812603d8-32c1-4b9f-9cf7-c5ee646c2a55" />


<img width="1344" height="685" alt="Screenshot 2023-08-05 044944" src="https://github.com/user-attachments/assets/a159879e-7e26-4a7c-8e1c-f388ed4f0188" />

<img width="972" height="618" alt="Screenshot 2023-08-05 045109" src="https://github.com/user-attachments/assets/d9e76507-0249-4bf4-874c-9b167c294156" />

<img width="1104" height="677" alt="Screenshot 2023-08-05 045040" src="https://github.com/user-attachments/assets/dcaa4c53-57d1-4868-9609-c60270086cb7" />


# 🗄️ Database Configuration

Configure MySQL inside:

```properties
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/blog_app
spring.datasource.username=root
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

# 🚀 Getting Started

## Prerequisites

Make sure you have installed:

- Java 17+
- Maven 3+
- MySQL 8+
- IDE (IntelliJ IDEA / Eclipse / VS Code)

---

## Clone Repository

```bash
git clone https://github.com/your-username/blogApp.git
```

```bash
cd blogApp
```

---

## Build Project

```bash
mvn clean install
```

---

## Run Application

```bash
mvn spring-boot:run
```

Application will start on:

```text
http://localhost:8080
```

---

# 📚 API Documentation

Swagger UI is available at:

```text
http://localhost:8080/swagger-ui/index.html
```

OpenAPI Documentation:

```text
http://localhost:8080/v3/api-docs
```

---

# 🔑 JWT Configuration

Example JWT properties:

```properties
jwt.secret=your-secret-key
jwt.expiration=86400000
```

### Authorization Header

```http
Authorization: Bearer <JWT_TOKEN>
```

---

# 🧪 Testing APIs

You can test APIs using:

- Swagger UI
- Postman
- Insomnia

---

# 📦 Dependencies Used

### Core

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Security

### Database

- MySQL Connector

### Security

- JWT API
- JWT Implementation
- JWT Jackson

### Documentation

- SpringDoc OpenAPI
- Swagger Annotations

### Utility

- Lombok
- ModelMapper
- Jakarta Validation API

---

# 🔒 Security Features

- Password Encryption
- JWT Authentication
- Stateless Sessions
- Endpoint Protection
- Custom Security Filters

---

# 🌟 Future Enhancements

- File Upload Support
- Profile Images
- Email Verification
- Refresh Tokens
- Like & Dislike System
- Social Login (Google/GitHub)
- Docker Support
- CI/CD Pipeline
- Redis Caching

---

# 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch

```bash
git checkout -b feature/new-feature
```

3. Commit changes

```bash
git commit -m "Added new feature"
```

4. Push to branch

```bash
git push origin feature/new-feature
```

5. Create Pull Request



# 👨‍💻 Author

**7pasim**

Built with ❤️ using Spring Boot

---

<div align="center">

⭐ Star this repository if you found it helpful!

</div>
