package model;

/**
 * Employee who earns a base salary plus a percentage of what he/she sells.
 */
public class CommissionEmployee extends Employee {

    private double baseSalary;
    private double totalSales;
    private double commissionRate; // e.g. 0.05 means 5%

    public CommissionEmployee(int id, String name, int age, Gender gender,
                              double baseSalary, double totalSales, double commissionRate) {
        super(id, name, age, gender);
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (totalSales * commissionRate);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + super.toString() + ", baseSalary=" + baseSalary
                + ", totalSales=" + totalSales + ", commissionRate=" + commissionRate + "}";
    }
}
