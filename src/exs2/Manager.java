package exs2;

import enums.Department;
import exs1.Employee;

public class Manager extends Employee {
    private double bonus;

    public Manager(String id, double wage, Department department, double bonus) {
        super(id, wage, department); // props from the superclass Employee
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getWage() + this.bonus;
    }

    // getter
    public double getBonus() {
        return bonus;
    }

    // setter
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
