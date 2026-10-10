package model;

/**
 * Base class for all kinds of employees.
 * Every subclass has to say how its own salary is calculated.
 */
public abstract class Employee {

    private int id;
    private String name;
    private int age;
    private Gender gender;
    private Department department;

    public Employee(int id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // each type of employee gets paid differently
    public abstract double calculateSalary();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    // package-private on purpose, Department.addEmployee() is the one that sets this
    void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        String dept = (department == null) ? "none" : department.getName();
        return "Employee{id=" + id + ", name='" + name + "', age=" + age
                + ", gender=" + gender + ", department=" + dept + "}";
    }
}
