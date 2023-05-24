# Spring Boot CRUD Application

This is a simple Spring Boot application that provides CRUD (Create, Read, Update, Delete) operations for managing person data.

## Prerequisites

- Java JDK 11 or higher installed
- Maven installed
- [H2 in-memory database](#h2-in-memory-database-setup)


## H2 In-Memory Database Setup

No additional setup is required for the H2 in-memory database as it is configured by default.

## How to Run the Application

1. Clone this repository to your local machine:

```shell
git clone https://github.com/your-username/your-repo.git

cd spring-boot-crud

mvn clean install

mvn spring-boot:run

The application will start and be accessible at http://localhost:8080.

API Endpoints
GET /api/persons: Get all persons.

curl http://localhost:8080/api/persons

GET /api/persons/{id}: Get a person by ID.

curl http://localhost:8080/api/persons/{id}

POST /api/persons: Create a new person.

curl -X POST -H "Content-Type: application/json" -d '{"firstName": "John", "lastName": "Doe", "phoneNumber": "1234567890"}' http://localhost:8080/api/persons

PUT /api/persons/{id}: Update a person by ID.

curl -X PUT -H "Content-Type: application/json" -d '{"firstName": "Jane", "lastName": "Doe", "phoneNumber": "9876543210"}' http://localhost:8080/api/persons/{id}

DELETE /api/persons/{id}: Delete a person by ID.

curl -X DELETE http://localhost:8080/api/persons/{id}

Please use tools like Postman or cURL to interact with the APIs and test different operations.
