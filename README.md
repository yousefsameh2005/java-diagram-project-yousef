# Employee Management System

**Name:** Yousef Sameh Mohamed AbdelNabi
**Student ID:** 2302004

## About the project

A small Java project that implements the class diagram given in the assignment.
It models an employee system where `Employee` is an abstract class and three
types of employees extend it, each with its own way of calculating salary:

- `CommissionEmployee` : base salary + commission on sales
- `MonthlyEmployee` : fixed monthly salary + optional bonus
- `HourlyEmployee` : hourly rate x hours worked (overtime after 160 hours paid 1.5x)

Each employee has a `Gender` (enum) and can belong to a `Department`.
A `Department` keeps a list of its employees and can calculate the total salaries.

## Project structure

```
src/
├── Main.java
├── model/
│   ├── Employee.java
│   ├── CommissionEmployee.java
│   ├── MonthlyEmployee.java
│   ├── HourlyEmployee.java
│   ├── Department.java
│   └── Gender.java
└── test/
    └── MainTest.java
```

## How to run

You need JDK 8 or newer.

From the project folder:

```
mkdir out
javac -d out src/model/*.java src/test/*.java src/Main.java
java -cp out Main
```

Or just open the folder in IntelliJ / Eclipse / VS Code and run `Main.java`.
