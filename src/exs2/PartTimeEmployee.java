package exs2;

import enums.Department;
import exs1.Employee;

public class PartTimeEmployee extends Employee {
    private int workHrs;

    // constructor
    public PartTimeEmployee(String id, double wage, Department department, int workHrs) {
        super(id, wage, department);
        this.workHrs = workHrs;
    }

    // override
    @Override
    public double calculateSalary() {
        return getWage() * this.workHrs;
    }

    // getter
    public int getWorkHrs() {
        return workHrs;
    }

    // setter
    public void setWorkHrs(int newWorkHrs) {
        this.workHrs = newWorkHrs;
    }
}
