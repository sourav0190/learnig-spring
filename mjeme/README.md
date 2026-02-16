# Banking Portal (mjeme)

A Spring Boot application for a Banking Portal system.

## Project Description
This application provides core banking functionalities including user management, account handling, and transaction processing. It is built using modern Java technologies and follows a standard layered architecture.

## Tech Stack
- **Java**: 17
- **Spring Boot**: 3.2.3
- **Database**: H2 (In-memory, for development/runtime)
- **Security**: Spring Security
- **Template Engine**: Thymeleaf
- **Build Tool**: Maven

## Features
- User Authentication & Authorization
- Account Management
- Secure Transactions
- Web Interface using Thymeleaf

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven

### Running the Application
1. Clone the repository.
2. Navigate to the `mjeme` directory.
3. Run the application using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
   (Or `mvn spring-boot:run` if you have Maven installed globally)

### Accessing the Application
Once the application is running, you can access it at `http://localhost:8080`.
