package com.haryana.assignment.employees;

/**
 * Developer class extending Employee with development-specific attributes.
 * Demonstrates inheritance and additional functionality specific to developers.
 * 
 * @author Student Assignment
 * @version 1.0
 */
public class Developer extends Employee {
    // Developer-specific private attributes
    private String[] programmingLanguages;
    private String projectAssignment;
    private int yearsOfExperience;
    
    /**
     * Constructor to initialize a Developer with employee and developer-specific information.
     * 
     * @param name The name of the developer
     * @param employeeId The unique employee ID
     * @param salary The salary of the developer
     * @param department The department assigned to
     * @param yearsOfExperience Years of professional experience
     * @param programmingLanguages Array of programming languages known
     * @param projectAssignment Current project assignment
     */
    public Developer(String name, int employeeId, double salary, 
                     String department, int yearsOfExperience,
                     String[] programmingLanguages, String projectAssignment) {
        super(name, employeeId, salary, department);
        this.yearsOfExperience = yearsOfExperience;
        this.programmingLanguages = programmingLanguages;
        this.projectAssignment = projectAssignment;
    }
    
    /**
     * Gets the years of professional experience.
     * 
     * @return Years of experience
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    /**
     * Sets the years of professional experience.
     * 
     * @param yearsOfExperience The years of experience
     * @throws IllegalArgumentException if years is negative
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Years of experience cannot be negative");
        }
        this.yearsOfExperience = yearsOfExperience;
    }
    
    /**
     * Gets the programming languages known by this developer.
     * 
     * @return Array of programming languages
     */
    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }
    
    /**
     * Sets the programming languages for this developer.
     * 
     * @param programmingLanguages Array of programming language names
     */
    public void setProgrammingLanguages(String[] programmingLanguages) {
        if (programmingLanguages != null) {
            this.programmingLanguages = programmingLanguages;
        }
    }
    
    /**
     * Gets the current project assignment.
     * 
     * @return The project name
     */
    public String getProjectAssignment() {
        return projectAssignment;
    }
    
    /**
     * Sets the current project assignment.
     * 
     * @param projectAssignment The project name
     */
    public void setProjectAssignment(String projectAssignment) {
        if (projectAssignment != null && !projectAssignment.trim().isEmpty()) {
            this.projectAssignment = projectAssignment;
        }
    }
    
    /**
     * Returns a formatted string of all programming languages.
     * 
     * @return Comma-separated list of languages
     */
    public String getLanguagesAsString() {
        return String.join(", ", programmingLanguages);
    }
    
    /**
     * Calculates skill level based on experience and number of languages.
     * 
     * @return Skill level (Junior/Mid/Senior)
     */
    public String getSkillLevel() {
        if (yearsOfExperience < 2) {
            return "Junior";
        } else if (yearsOfExperience < 5) {
            return "Mid-Level";
        } else {
            return "Senior";
        }
    }
    
    /**
     * Returns a string representation of the Developer.
     * 
     * @return A formatted string with developer details
     */
    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", employeeId=" + getEmployeeId() +
                ", salary=" + getSalary() +
                ", department='" + getDepartment() + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", languages=" + getLanguagesAsString() +
                ", projectAssignment='" + projectAssignment + '\'' +
                ", skillLevel='" + getSkillLevel() + '\'' +
                '}';
    }
}