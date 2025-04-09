
# 📸 Photo App – Microservices Architecture

A cloud-native **Photo App** built with Spring Boot Microservices, Docker, and deployed to AWS. This project demonstrates a robust architecture using modern technologies like Eureka, API Gateway, Spring Cloud Config, Spring Security (JWT), Resilience4J, and centralized logging with the ELK stack.

---

## 🚀 Tech Stack

- **Backend Frameworks:** Spring Boot, Spring Cloud, Spring Security
- **Microservices Tools:** Eureka Discovery, Spring Cloud Config Server, API Gateway, Feign Client, Resilience4J, Load Balancing
- **Security:** JWT, Spring Security, Method-Level Security
- **Databases:** MySQL, H2 (in-memory)
- **Messaging:** RabbitMQ, Spring Cloud Bus
- **Monitoring & Logging:** Spring Boot Actuator, Sleuth, Zipkin, ELK Stack (Elasticsearch, Logstash, Kibana)
- **Containerization & Deployment:** Docker, AWS
- **Tools:** Spring Initializr, Spring Tool Suite, Postman

---

## 🛠️ Features

- ✅ Build and run **RESTful Microservices**
- ✅ **User Authentication** and **Authorization** with Spring Security and JWT
- ✅ Service Discovery with **Eureka Server**
- ✅ **Spring Cloud API Gateway** for routing and filtering
- ✅ **Feign Clients** for inter-service communication
- ✅ **Resilience4J** for circuit breaking and fault tolerance
- ✅ **Spring Cloud Config Server** to manage external configuration
- ✅ **Encrypt sensitive configuration data**
- ✅ **MySQL integration** for persistent storage
- ✅ **H2 Database** support for development/testing
- ✅ **Spring Boot Actuator** for monitoring service health
- ✅ **Distributed tracing** with **Sleuth** and **Zipkin**
- ✅ **Centralized Logging** with the ELK Stack
- ✅ **Dockerized Microservices** for container-based deployment
- ✅ **AWS deployment** support

---

## 🧪 Development and Tools

- 📌 Built using **Spring Initializr**
- 🧪 API Testing with **Postman**
- 🔧 Development using **Spring Tool Suite (STS)**

---

## 🐳 How to Run with Docker

1. Make sure Docker is installed and running.
2. Build the microservices:
   ```bash
   ./mvnw clean install
   ```
3. Build Docker images and run containers:
   ```bash
   docker-compose up --build
   ```

---

## ☁️ Deploy to AWS

1. Containerize services with Docker
2. Push images to Amazon ECR
3. Deploy using ECS/Fargate or EC2 with Docker
4. Use AWS RDS for MySQL and CloudWatch for logging (optional)

---

## 📷 Services Overview

| Service             | Description                            |
|---------------------|----------------------------------------|
| Config Server       | Centralized external configuration     |
| Eureka Server       | Service registry and discovery         |
| API Gateway         | Routing, filtering, and auth handling  |
| User Service        | Handles user registration/login/auth   |
| Photo Service       | Core service for photo-related actions |
| Auth Service        | Issues and validates JWT tokens        |

---
