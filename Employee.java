package com.haryana.assignment.employees;

/**
 * Base Employee class demonstrating access modifiers and encapsulation.
 * This class serves as a parent class for all employee types.
 * 
 * Access Modifiers Used:
 * - private: Restricts access to the class itself
 * - protected: Allows access to subclasses and same package
 * - public: Allows access from anywhere
 * 
 * @author Student Assignment
 * @version 1.0
 */
public class Employee {
    // Private attributes - only accessible within this class
    private String name;
    private int employeeId;
    private double salary;
    
    // Protected attribute - accessible to subclasses
    protected String department;
    
    /**
     * Constructor to initialize an Employee with basic information.
     * 
     * @param name The name of the employee
     * @param employeeId The unique employee ID
     * @param salary The salary of the employee
     * @param department The department the employee works in
     */
    public Employee(String name, int employeeId, double salary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }
    
    /**
     * Gets the name of the employee.
     * 
     * @return The employee's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the employee.
     * 
     * @param name The new name to set
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    /**
     * Gets the employee ID.
     * 
     * @return The unique employee ID
     */
    public int getEmployeeId() {
        return employeeId;
    }
    
    /**
     * Gets the salary of the employee.
     * 
     * @return The employee's salary
     */
    public double getSalary() {
        return salary;
    }
    
    /**
     * Sets the salary of the employee.
     * 
     * @param salary The new salary amount
     * @throws IllegalArgumentException if salary is negative
     */
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }
    
    /**
     * Gets the department of the employee.
     * 
     * @return The employee's department
     */
    public String getDepartment() {
        return department;
    }
    
    /**
     * Sets the department of the employee.
     * 
     * @param department The new department
     */
    public void setDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        }
    }
    
    /**
     * Returns a string representation of the Employee.
     * 
     * @return A formatted string with employee details
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}