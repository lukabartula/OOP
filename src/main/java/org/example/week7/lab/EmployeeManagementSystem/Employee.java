package org.example.week7.lab.EmployeeManagementSystem;

import java.util.List;
import java.util.stream.Collectors;

record Employee(int id, String name, double salary) {}

class EmployeeManagementSystem{
    public List<Employee> filterEmployeesBySalary (List<Employee> employees, double minimum){
        return employees.stream()
                .filter(employee -> employee.salary()>=minimum)
                .toList();
    }

    public double calculateTotalSalary(List<Employee> employees){
        return employees.stream()
                .mapToDouble(employee -> employee.salary())
                .sum();
    }

    public void displayEmployeeDetails (List<Employee> employees){
         employees.stream()
             .forEach(System.out::println);
    }
}

class Main{
    public static void main(String[] args) {
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        List<Employee> employees = List.of(
                new Employee(1, "Bager", 50000.0),
                new Employee(2, "Beton", 60000.0),
                new Employee(3, "Mesalica", 75000.0)
        );

        List<Employee> employeesFiltered = employeeManagementSystem.filterEmployeesBySalary(employees, 60000.0);
        System.out.println("Employees with minimum salary:");
        /*for (Employee e : employeesFiltered){
            System.out.println(e);
        }*/

        employeeManagementSystem.displayEmployeeDetails(employeesFiltered);
        System.out.println();
        double total = employeeManagementSystem.calculateTotalSalary(employees);
        System.out.println("Total salaries of employees: " + total);
        System.out.println();
        employeeManagementSystem.displayEmployeeDetails(employees);
    }
}
