package model;

/**
 * Employee paid per hour. Hours above 160 in a month count as overtime (1.5x).
 */
public class HourlyEmployee extends Employee {

    private static final int NORMAL_HOURS = 160;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(int id, String name, int age, Gender gender,
                          double hourlyRate, int hoursWorked) {
        super(id, name, age, gender);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        if (hoursWorked <= NORMAL_HOURS) {
            return hoursWorked * hourlyRate;
        }
        int overtime = hoursWorked - NORMAL_HOURS;
        return (NORMAL_HOURS * hourlyRate) + (overtime * hourlyRate * OVERTIME_MULTIPLIER);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() + ", hourlyRate=" + hourlyRate
                + ", hoursWorked=" + hoursWorked + "}";
    }
}
