# Pizza Factory

Welcome to the Pizza Factory project! This project implements a pizza factory using the Java factory pattern, showcasing various types of pizzas and adhering to the principles of object-oriented design, including the Liskov Substitution Principle.

## Project Structure

The project is organized as follows:

```
pizza-factory
├── src
│   ├── main
│   │   └── java
│   │       ├── pizza
│   │       │   ├── Pizza.java
│   │       │   ├── CheesePizza.java
│   │       │   ├── GreekPizza.java
│   │       │   ├── PeperoniPizza.java
│   │       │   └── GlutenFreePizza.java
│   │       ├── factory
│   │       │   └── PizzaFactory.java
│   │       └── store
│   │           └── PizzaStore.java
│   └── test
│       └── java
│           └── pizza
│               └── PizzaFactoryTest.java
├── pom.xml
└── README.md
```

## Overview

This project simulates a pizza factory where different types of pizzas can be created and ordered. The main components include:

- **Pizza**: An abstract class that defines the basic structure and methods for all pizza types.
- **Pizza Types**: Specific implementations of the Pizza class, including:
  - CheesePizza
  - GreekPizza
  - PeperoniPizza
  - GlutenFreePizza
- **PizzaFactory**: A factory class responsible for creating instances of different pizza types based on input.
- **PizzaStore**: A class that utilizes the PizzaFactory to order pizzas.

## How to Build and Run

1. **Clone the Repository**:
   ```
   git clone <repository-url>
   cd pizza-factory
   ```

2. **Build the Project**:
   Use Maven to build the project:
   ```
   mvn clean install
   ```

3. **Run the Application**:
   You can run the application by executing the main method in the `PizzaStore` class.

4. **Run Unit Tests**:
   To run the unit tests, execute:
   ```
   mvn test
   ```

## Scenario

Connecticut is famous for its pizza, and this project aims to capture the essence of a pizza factory where customers can order their favorite types of pizza. The factory pattern allows for easy extension of new pizza types without modifying existing code, adhering to the Open/Closed Principle.

Enjoy building and running your pizza factory!