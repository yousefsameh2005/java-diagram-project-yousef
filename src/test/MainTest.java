package test;

import model.CommissionEmployee;
import model.Department;
import model.Employee;
import model.Gender;
import model.HourlyEmployee;
import model.MonthlyEmployee;

public class MainTest {

    public static void main(String[] args) {

        // departments
        Department sales = new Department(1, "Sales");
        Department it = new Department(2, "IT");

        // employees with some demo data
        Employee e1 = new CommissionEmployee(101, "Omar Hassan", 29, Gender.MALE, 3000, 50000, 0.05);
        Employee e2 = new CommissionEmployee(102, "Mona Adel", 26, Gender.FEMALE, 3200, 42000, 0.04);
        Employee e3 = new MonthlyEmployee(201, "Ahmed Samir", 35, Gender.MALE, 9000, 1000);
        Employee e4 = new MonthlyEmployee(202, "Sara Khaled", 31, Gender.FEMALE, 8500);
        Employee e5 = new HourlyEmployee(301, "Youssef Ali", 22, Gender.MALE, 40, 150);
        Employee e6 = new HourlyEmployee(302, "Nour Ibrahim", 24, Gender.FEMALE, 45, 175);

        // put them in departments
        sales.addEmployee(e1);
        sales.addEmployee(e2);
        sales.addEmployee(e5);
        it.addEmployee(e3);
        it.addEmployee(e4);
        it.addEmployee(e6);

        printDepartment(sales);
        printDepartment(it);

        // moving someone to another department
        System.out.println("Moving " + e5.getName() + " from Sales to IT...");
        sales.removeEmployee(e5);
        it.addEmployee(e5);
        System.out.println();

        printDepartment(sales);
        printDepartment(it);
    }

    private static void printDepartment(Department dept) {
        System.out.println("=== " + dept.getName() + " Department ===");
        for (Employee e : dept.getEmployees()) {
            System.out.printf("%-4d %-14s %-8s %-18s salary: %.2f%n",
                    e.getId(), e.getName(), e.getGender(),
                    e.getClass().getSimpleName(), e.calculateSalary());
        }
        System.out.printf("Total salaries: %.2f%n%n", dept.getTotalSalaries());
    }
}
