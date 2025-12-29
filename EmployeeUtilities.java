package com.haryana.assignment.utilities;

import com.haryana.assignment.employees.Employee;
import com.haryana.assignment.employees.Manager;
import com.haryana.assignment.employees.Developer;

/**
 * EmployeeUtilities class demonstrating proper usage of access modifiers.
 * Provides utility methods to perform operations on Employee objects.
 * 
 * Access Modifier Demonstration:
 * - Can access public methods of Employee and subclasses
 * - Can access protected members since it's in the same package hierarchy
 * - Cannot access private members directly
 * 
 * @author Student Assignment
 * @version 1.0
 */
public class EmployeeUtilities {
    
    /**
     * Displays employee information in a formatted manner.
     * Demonstrates accessing public getters without access to private fields.
     * 
     * @param employee The employee object to display
     */
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("\n=== Employee Information ===");
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: Rs. " + employee.getSalary());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println(employee.toString());
    }
    
    /**
     * Displays manager-specific information.
     * Shows how to work with subclass-specific attributes.
     * 
     * @param manager The manager object to display
     */
    public static void displayManagerInfo(Manager manager) {
        displayEmployeeInfo(manager);
        System.out.println("\n=== Manager Details ===");
        System.out.println("Team Size: " + manager.getTeamSize());
        System.out.println("Performance Bonus: " + manager.getPerformanceBonus() + "%");
        System.out.println("Total Compensation: Rs. " + manager.calculateTotalCompensation());
        System.out.println("Team Members:");
        for (int i = 0; i < manager.getTeamMembers().length; i++) {
            if (manager.getTeamMembers()[i] != null) {
                System.out.println("  " + (i + 1) + ". " + manager.getTeamMembers()[i]);
            }
        }
    }
    
    /**
     * Displays developer-specific information.
     * Shows how to work with subclass-specific attributes.
     * 
     * @param developer The developer object to display
     */
    public static void displayDeveloperInfo(Developer developer) {
        displayEmployeeInfo(developer);
        System.out.println("\n=== Developer Details ===");
        System.out.println("Skill Level: " + developer.getSkillLevel());
        System.out.println("Years of Experience: " + developer.getYearsOfExperience());
        System.out.println("Programming Languages: " + developer.getLanguagesAsString());
        System.out.println("Current Project: " + developer.getProjectAssignment());
    }
    
    /**
     * Compares two employees by salary.
     * Demonstrates using public methods to access private fields indirectly.
     * 
     * @param emp1 First employee to compare
     * @param emp2 Second employee to compare
     * @return 1 if emp1 has higher salary, -1 if emp2 has higher salary, 0 if equal
     */
    public static int compareSalaries(Employee emp1, Employee emp2) {
        double salary1 = emp1.getSalary();
        double salary2 = emp2.getSalary();
        
        if (salary1 > salary2) {
            return 1;
        } else if (salary1 < salary2) {
            return -1;
        }
        return 0;
    }
    
    /**
     * Calculates average salary for a group of employees.
     * Demonstrates iteration and aggregation operations.
     * 
     * @param employees Array of employees
     * @return Average salary of all employees
     */
    public static double calculateAverageSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return 0;
        }
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
        }
        return totalSalary / employees.length;
    }
    
    /**
     * Generates a salary report for multiple employees.
     * 
     * @param employees Array of employees to include in report
     * @return Formatted salary report string
     */
    public static String generateSalaryReport(Employee[] employees) {
        StringBuilder report = new StringBuilder();
        report.append("\n=== Salary Report ===\n");
        report.append(String.format("%-30s | %-12s | %-12s\n", "Name", "Employee ID", "Salary"));
        report.append("-".repeat(60)).append("\n");
        
        double totalSalary = 0;
        for (Employee emp : employees) {
            report.append(String.format("%-30s | %-12d | Rs. %.2f\n", 
                emp.getName(), emp.getEmployeeId(), emp.getSalary()));
            totalSalary += emp.getSalary();
        }
        report.append("-".repeat(60)).append("\n");
        report.append(String.format("Total Salary: Rs. %.2f\n", totalSalary));
        report.append(String.format("Average Salary: Rs. %.2f\n", calculateAverageSalary(employees)));
        
        return report.toString();
    }
    
    /**
     * Applies a salary increment to an employee.
     * Demonstrates modifying private fields through public setter methods.
     * 
     * @param employee The employee to give increment to
     * @param incrementPercentage The percentage to increment
     * @throws IllegalArgumentException if percentage is invalid
     */
    public static void applySalaryIncrement(Employee employee, double incrementPercentage) {
        if (incrementPercentage < 0 || incrementPercentage > 100) {
            throw new IllegalArgumentException("Increment percentage must be between 0 and 100");
        }
        double currentSalary = employee.getSalary();
        double newSalary = currentSalary + (currentSalary * incrementPercentage / 100);
        employee.setSalary(newSalary);
        System.out.println("\nSalary increment applied to " + employee.getName());
        System.out.println("Previous Salary: Rs. " + currentSalary);
        System.out.println("New Salary: Rs. " + newSalary);
    }
}