# Retail Core

> **A modular backend platform built with Java 21 and Spring Boot.**

Retail Core is a long-term backend engineering project that explores how
an enterprise application evolves from a single service into a modular
platform. The project is being built incrementally, with each feature
added to solve a practical problem rather than simply demonstrate a
framework.

The goal is to create a production-style backend that showcases modern
Java development, event-driven architecture, security, containerization
and cloud-ready design.

------------------------------------------------------------------------

## What this repository demonstrates

-   Building REST APIs with Spring Boot
-   Layered application architecture
-   Spring Data JPA and Flyway database migrations
-   Event-driven communication using Kafka
-   Authentication and authorization with Keycloak
-   Containerized development using Docker Compose
-   CI with GitHub Actions
-   Modern backend engineering practices

------------------------------------------------------------------------

## Architecture

The repository is organized into two main areas:

``` text
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

-   **infrastructure/** contains the supporting services required to run
    the platform locally.
-   **product-service/** contains the Spring Boot application.
-   Additional services will be added as the platform grows.

------------------------------------------------------------------------

## Technology Stack

  Area               Technologies
  ------------------ ----------------------------------
  Backend            Java 21, Spring Boot, Spring MVC
  Database           MySQL, PostgreSQL
  Messaging          Apache Kafka
  Security           Spring Security, Keycloak
  Persistence        Spring Data JPA, Flyway
  Containerization   Docker, Docker Compose
  Build              Maven
  CI                 GitHub Actions

------------------------------------------------------------------------

## Current Status

### Completed

-   ✅ Product Service
-   ✅ Docker Compose Environment
-   ✅ Kafka Infrastructure
-   ✅ PostgreSQL
-   ✅ MySQL
-   ✅ Keycloak
-   ✅ LDAP
-   ✅ Flyway Database Migrations
-   ✅ GitHub Actions Pipeline

### In Progress

-   🚧 Product APIs
-   🚧 Kafka Event Publishing
-   🚧 Kafka Consumers

### Planned

-   Redis Caching
-   Inventory Service
-   Order Service
-   Notification Service
-   API Gateway
-   Kubernetes
-   Helm
-   AWS Deployment
-   Monitoring & Observability

------------------------------------------------------------------------

## Roadmap

The long-term vision is to evolve Retail Core into a modular backend
platform consisting of multiple services communicating through events.

Planned services include:

-   Product Service
-   Inventory Service
-   Order Service
-   Notification Service
-   Shared Common Library

Future enhancements include:

-   Redis
-   Event-driven architecture
-   Distributed caching
-   Kubernetes
-   Helm
-   Prometheus & Grafana
-   OpenTelemetry
-   AWS deployment examples

------------------------------------------------------------------------

## Running the Project

Start the infrastructure:

``` bash
docker compose up -d
```

Start the Spring Boot application from the **product-service** module.

------------------------------------------------------------------------

## Documentation

Documentation will grow alongside the project and will eventually
include:

-   Architecture diagrams
-   API documentation
-   Sequence diagrams
-   Design decisions
-   Deployment guides
-   Screenshots

------------------------------------------------------------------------

## License

This repository is intended for learning, experimentation and
demonstrating modern backend engineering practices.
