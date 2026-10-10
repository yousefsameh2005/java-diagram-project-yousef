package model;

import java.util.ArrayList;
import java.util.List;

/**
 * A department has many employees (aggregation: employees can exist without it).
 */
public class Department {

    private int id;
    private String name;
    private List<Employee> employees;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employee != null && !employees.contains(employee)) {
            employees.add(employee);
            employee.setDepartment(this);
        }
    }

    public void removeEmployee(Employee employee) {
        if (employees.remove(employee)) {
            employee.setDepartment(null);
        }
    }

    public double getTotalSalaries() {
        double total = 0;
        for (Employee e : employees) {
            total += e.calculateSalary();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "', employees=" + employees.size() + "}";
    }
}
