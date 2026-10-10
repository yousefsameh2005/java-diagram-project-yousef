package model;

/**
 * Employee with a fixed monthly salary, plus an optional bonus.
 */
public class MonthlyEmployee extends Employee {

    private double monthlySalary;
    private double bonus;

    public MonthlyEmployee(int id, String name, int age, Gender gender, double monthlySalary) {
        this(id, name, age, gender, monthlySalary, 0);
    }

    public MonthlyEmployee(int id, String name, int age, Gender gender,
                           double monthlySalary, double bonus) {
        super(id, name, age, gender);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "MonthlyEmployee{" + super.toString() + ", monthlySalary=" + monthlySalary
                + ", bonus=" + bonus + "}";
    }
}
