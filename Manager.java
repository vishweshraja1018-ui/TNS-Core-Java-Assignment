package com.haryana.assignment.employees;

/**
 * Manager class extending Employee with management-specific attributes.
 * Demonstrates inheritance and additional functionality specific to managers.
 * 
 * @author Student Assignment
 * @version 1.0
 */
public class Manager extends Employee {
    // Manager-specific private attributes
    private int teamSize;
    private double performanceBonus;
    private String[] teamMembers;
    
    /**
     * Constructor to initialize a Manager with employee and manager-specific information.
     * 
     * @param name The name of the manager
     * @param employeeId The unique employee ID
     * @param salary The salary of the manager
     * @param department The department managed
     * @param teamSize The number of team members
     * @param performanceBonus The performance bonus percentage
     */
    public Manager(String name, int employeeId, double salary, 
                   String department, int teamSize, double performanceBonus) {
        super(name, employeeId, salary, department);
        this.teamSize = teamSize;
        this.performanceBonus = performanceBonus;
        this.teamMembers = new String[teamSize];
    }
    
    /**
     * Gets the size of the team managed by this manager.
     * 
     * @return The number of team members
     */
    public int getTeamSize() {
        return teamSize;
    }
    
    /**
     * Sets the team size.
     * 
     * @param teamSize The new team size
     * @throws IllegalArgumentException if team size is negative
     */
    public void setTeamSize(int teamSize) {
        if (teamSize < 0) {
            throw new IllegalArgumentException("Team size cannot be negative");
        }
        this.teamSize = teamSize;
        this.teamMembers = new String[teamSize];
    }
    
    /**
     * Gets the performance bonus percentage.
     * 
     * @return The performance bonus percentage
     */
    public double getPerformanceBonus() {
        return performanceBonus;
    }
    
    /**
     * Sets the performance bonus percentage.
     * 
     * @param performanceBonus The new bonus percentage
     * @throws IllegalArgumentException if bonus is negative or exceeds 100
     */
    public void setPerformanceBonus(double performanceBonus) {
        if (performanceBonus < 0 || performanceBonus > 100) {
            throw new IllegalArgumentException("Bonus must be between 0 and 100");
        }
        this.performanceBonus = performanceBonus;
    }
    
    /**
     * Gets the array of team member names.
     * 
     * @return Array of team member names
     */
    public String[] getTeamMembers() {
        return teamMembers;
    }
    
    /**
     * Adds a team member to the manager's team.
     * 
     * @param index The position in the team array
     * @param memberName The name of the team member
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public void addTeamMember(int index, String memberName) {
        if (index < 0 || index >= teamMembers.length) {
            throw new IndexOutOfBoundsException("Invalid team member index");
        }
        teamMembers[index] = memberName;
    }
    
    /**
     * Calculates the total compensation including base salary and bonus.
     * 
     * @return The total compensation amount
     */
    public double calculateTotalCompensation() {
        return getSalary() + (getSalary() * performanceBonus / 100);
    }
    
    /**
     * Returns a string representation of the Manager.
     * 
     * @return A formatted string with manager details
     */
    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", employeeId=" + getEmployeeId() +
                ", salary=" + getSalary() +
                ", department='" + getDepartment() + '\'' +
                ", teamSize=" + teamSize +
                ", performanceBonus=" + performanceBonus + "%" +
                ", totalCompensation=" + calculateTotalCompensation() +
                '}';
    }
}