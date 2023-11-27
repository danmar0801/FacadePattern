# Pizzeria Simulation Project

## Introduction
This project simulates a pizzeria ordering system, demonstrating the use of design patterns, particularly the Facade pattern, in a Java application. It allows for the creation of pizza orders with various toppings and sizes, processed through a simplified interface.

Link to slides presentation:
https://docs.google.com/presentation/d/1haHK6D7QhjAM8UB6QbfMsMljdPiGFyYT5I2a9RWLAv8/edit?usp=sharing

## Setup and Running the Project

### Prerequisites
- Java Development Kit (JDK), version 8 or above.
- An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans.

### Running the Project
1. Clone the repository or download the source code.
2. Open the project in your IDE.
3. Ensure that the JDK is properly set up in your IDE's project structure settings.
4. Navigate to the `Main.java` file in the project.
5. Run the `Main` class to start the simulation.

## Project Structure

- `src`: Source folder for the project.
  - `pizzeria`: Main package containing the classes for the pizzeria simulation.
    - `PizzeriaFacade.java`: Facade class that simplifies ordering of pizzas.
    - `Pizza.java`: Represents a pizza with size and toppings.
    - `Order.java`: Represents a customer's order.
    - `PizzaFactory.java`: Utility class for creating random pizzas.
    - `interfaces`: Contains various interfaces used in the project.
    - `pizzas`: Contains classes representing different types of pizzas.
    - `toppings`: Contains classes for various pizza toppings.
    - `workers`: Contains classes representing different workers in the pizzeria (e.g., OrderTaker, Oven, DeliveryGuy).
