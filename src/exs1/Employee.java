package exs1;

import enums.Department;

public class Employee {
    private final String id;
    private final double wage;
    private Department department;

    public Employee(String id, double wage, Department department) {
        this.id = id;
        this.wage = wage;
        this.department = department;
    }

    // getters
    public String getId() {
        return id;
    }

    public double getWage() {
        return wage;
    }

    public Department getDepartment() {
        return department;
    }

    // setter
    public void setDepartment(Department department) {
        this.department = department;
    }
}