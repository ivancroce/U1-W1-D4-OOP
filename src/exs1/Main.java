package exs1;

public class Main {
    public static void main(String[] args) {
        /*Employee e1 = new Employee("E001", 1500.00, Department.PRODUCTION);
        Employee e2 = new Employee("E002", 1800.00, Department.ADMINISTRATION);
        Employee e3 = new Employee("E003", 1600.00, Department.SALES);

        // array of employees
      *//*  Employee[] employees = new Employee[3];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;*//*

        // better syntax shortcut, when we already have the values
        Employee[] employees = {e1, e2, e3};

        for (Employee e : employees) {
            System.out.println("ID: " + e.getId());
        }*/
    }
}
