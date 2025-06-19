package exs1;

import enums.Department;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("E001", 1500.00, Department.PRODUCTION);
        Employee e2 = new Employee("E002", 1800.00, Department.ADMINISTRATION);
        Employee e3 = new Employee("E003", 1600.00, Department.SALES);

        Employee[] employees = {e1, e2, e3};

        for (Employee e : employees) {
            System.out.println("ID: " + e.getId());
        }
    }
}
