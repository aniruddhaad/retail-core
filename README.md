# Retail Core – Enterprise Backend Platform

> A modular backend platform built with Java 21, Spring Boot and event-driven architecture.

Retail Core is a long-term backend engineering project that explores how an enterprise application evolves from a single service into a modular platform. The project is being built incrementally, with each feature solving a practical problem rather than simply demonstrating a framework.

The goal is to create a production-style backend that showcases modern Java development, event-driven architecture, security, containerization and cloud-ready design.

---

## What this repository demonstrates

- Building REST APIs with Spring Boot
- Layered application architecture
- Spring Data JPA and Flyway database migrations
- Event-driven communication using Kafka
- Authentication and authorization with Keycloak
- Containerized development using Docker Compose
- CI with GitHub Actions
- Modern backend engineering practices

---

## Architecture

```text
retail-core
│
├── infrastructure/
│   ├── kafka/
│   ├── keycloak/
│   ├── ldap/
│   ├── mysql/
│   ├── postgres/
│   └── redis/
│
├── product-service/
│
└── docker-compose.yml
```

- **infrastructure/** contains the supporting services required to run the platform locally.
- **product-service/** contains the Spring Boot application.
- Additional services will be added as the platform grows.

---

## Technology Stack

### Backend
- Java 21
- Spring Boot
- Spring MVC

### Database
- MySQL
- PostgreSQL

### Messaging
- Apache Kafka

### Security
- Spring Security
- Keycloak

### Persistence
- Spring Data JPA
- Flyway

### Containerization
- Docker
- Docker Compose

### Build
- Maven

### CI/CD
- GitHub Actions

---

## Current Status

### Completed
- ✅ Product Service
- ✅ Docker Compose Environment
- ✅ Kafka Infrastructure
- ✅ PostgreSQL
- ✅ MySQL
- ✅ Keycloak
- ✅ LDAP
- ✅ Flyway Database Migrations
- ✅ GitHub Actions Pipeline

### In Progress
- 🚧 Product APIs
- 🚧 Kafka Event Publishing
- 🚧 Kafka Consumers

### Planned
- Redis Caching
- Inventory Service
- Order Service
- Notification Service
- API Gateway
- Kubernetes
- Helm
- AWS Deployment
- Monitoring & Observability

---

## Running the Project

```bash
docker compose up -d
```

Start the Spring Boot application from the **product-service** module.
