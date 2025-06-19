package exs1;

import enums.Department;

/*public class Employee {
    private final String id;
    private final double wage;
    private Department department;

    // constructor
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
}*/

public abstract class Employee {
    private final String id;
    private final double wage;
    private Department department;

    // constructor
    public Employee(String id, double wage, Department department) {
        this.id = id;
        this.wage = wage;
        this.department = department;
    }

    // abstract method
    // every subclass will have this method
    public abstract double calculateSalary();

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