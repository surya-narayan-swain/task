package test;

import java.util.ArrayList;
import java.util.List;

class Employee {
   
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("-----------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Employee objects
    	Employee emp1 = new Employee(1, "Ram", 50000.0);
        Employee emp2 = new Employee(2, "Hari", 60000.0);
        Employee emp3 = new Employee(3, "sita", 55000.0);
        // Store employees in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Display details of all employees
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
