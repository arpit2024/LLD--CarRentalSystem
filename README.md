# Car Rental System - Low-Level Design (LLD)

This repository showcases the low-level design (LLD) and implementation of a **Car Rental System**, emphasizing the practical application of backend development concepts with **Spring Boot**.

## Features

- **RESTful APIs** for core functionalities:
    - **Fetch available cars**: `GET /AvailableCars`
    - **Retrieve car details by ID**: `GET /{id}`
    - **Reserve a car**: `POST /reserve`
- **Controller Design**:
    - The `RentalSystem` class serves as the entry point for managing car rental operations.
    - Leverages **dependency injection** for seamless integration with the `CarBookingImplementation` service.
- **Modular Implementation**:
    - Business logic is encapsulated in the `CarBookingImplementation` service.
- Focus on real-world use cases, including:
    - Vehicle availability management
    - Reservation handling
    - Scalability and maintainability in design

## Technologies/Tools

- **Spring Boot** for backend development
- **Java** for object-oriented programming
- **REST API** design and implementation
- **Dependency Injection** for clean and modular architecture

## About the Project

This project demonstrates both the **low-level design (LLD)** and working backend functionality of a car rental system. It highlights the principles of clean code, modularity, and scalability while addressing common real-world requirements in car rental applications.
