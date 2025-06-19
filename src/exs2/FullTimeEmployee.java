package exs2;

import enums.Department;
import exs1.Employee;

public class FullTimeEmployee extends Employee {

    // constructor
    public FullTimeEmployee(String id, double wage, Department department) {
        super(id, wage, department);
    }

    @Override
    public double calculateSalary() {
        return getWage();
    }
}
