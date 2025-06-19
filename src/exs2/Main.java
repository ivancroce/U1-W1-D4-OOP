package exs2;

import enums.Department;
import exs1.Employee;

public class Main {
    public static void main(String[] args) {
        Employee ft1 = new FullTimeEmployee("FT001", 2000.00, Department.PRODUCTION);
        Employee pt1 = new PartTimeEmployee("PT001", 12.00, Department.SALES, 80);
        Employee m1 = new Manager("M001", 3000.00, Department.ADMINISTRATION, 500.00);

        Employee[] employees = {ft1, pt1, m1};

        double totalSalary = 0.0;
        System.out.println("--- Total ---");

        for (Employee emp : employees) {
            double salary = emp.calculateSalary();
            System.out.println("ID: " + emp.getId() + " - Wage: " + salary + " $");

            totalSalary += salary;
        }
        System.out.println("---");
        System.out.println("Total Salary: " + totalSalary + " $");
        System.out.println("---");
    }
}
