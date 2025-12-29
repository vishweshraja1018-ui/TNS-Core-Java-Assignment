/**
 * AssignmentMain class - Main entry point for the assignment.
 * Demonstrates the complete usage of packages, access modifiers,
 * inheritance, and utility methods.
 * 
 * This class is placed outside of any package to show the usage
 * of classes from different packages with proper access control.
 * 
 * @author Student Assignment
 * @version 1.0
 */

import com.haryana.assignment.employees.Manager;
import com.haryana.assignment.employees.Developer;
import com.haryana.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    
    /**
     * Main method - Entry point of the Java application.
     * 
     * Demonstrates:
     * 1. Creating instances of Manager and Developer classes
     * 2. Using public and protected access modifiers appropriately
     * 3. Invoking utility methods from EmployeeUtilities class
     * 4. Showing proper encapsulation through getter and setter methods
     * 
     * @param args Command line arguments (not used in this assignment)
     */
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  Java Assignment - Packages & Modifiers");
        System.out.println("========================================");
        
        // Create Manager instances
        Manager manager1 = new Manager(
            "Rahul Kumar Singh",
            1001,
            85000,
            "Engineering",
            5,
            15
        );
        
        // Add team members to manager1
        manager1.addTeamMember(0, "Priya Sharma");
        manager1.addTeamMember(1, "Arjun Patel");
        manager1.addTeamMember(2, "Neha Verma");
        manager1.addTeamMember(3, "Vikram Das");
        manager1.addTeamMember(4, "Anjali Singh");
        
        // Create second Manager instance
        Manager manager2 = new Manager(
            "Kavya Desai",
            1002,
            78000,
            "Quality Assurance",
            3,
            12
        );
        
        manager2.addTeamMember(0, "Rohit Gupta");
        manager2.addTeamMember(1, "Sneha Reddy");
        manager2.addTeamMember(2, "Aditya Nair");
        
        // Create Developer instances
        String[] javaLanguages = {"Java", "Python", "JavaScript", "SQL"};
        Developer developer1 = new Developer(
            "Sameer Joshi",
            2001,
            65000,
            "Engineering",
            4,
            javaLanguages,
            "Mobile App Development"
        );
        
        String[] pythonLanguages = {"Python", "C++", "Go", "Rust"};
        Developer developer2 = new Developer(
            "Divya Iyer",
            2002,
            72000,
            "Engineering",
            6,
            pythonLanguages,
            "Data Processing Pipeline"
        );
        
        String[] jsLanguages = {"JavaScript", "TypeScript", "React.js", "Node.js"};
        Developer developer3 = new Developer(
            "Harsh Malhotra",
            2003,
            58000,
            "Engineering",
            2,
            jsLanguages,
            "Frontend Development"
        );
        
        // Display information using EmployeeUtilities
        System.out.println("\n\n### DISPLAYING MANAGER INFORMATION ###");
        EmployeeUtilities.displayManagerInfo(manager1);
        EmployeeUtilities.displayManagerInfo(manager2);
        
        System.out.println("\n\n### DISPLAYING DEVELOPER INFORMATION ###");
        EmployeeUtilities.displayDeveloperInfo(developer1);
        EmployeeUtilities.displayDeveloperInfo(developer2);
        EmployeeUtilities.displayDeveloperInfo(developer3);
        
        // Demonstrate salary comparison
        System.out.println("\n\n### SALARY COMPARISON ###");
        int comparison = EmployeeUtilities.compareSalaries(manager1, developer1);
        if (comparison > 0) {
            System.out.println(manager1.getName() + " has higher salary than " + developer1.getName());
        } else if (comparison < 0) {
            System.out.println(developer1.getName() + " has higher salary than " + manager1.getName());
        } else {
            System.out.println("Both have same salary");
        }
        
        // Create array of employees and generate report
        System.out.println("\n\n### SALARY REPORT ###");
        com.haryana.assignment.employees.Employee[] employees = {
            manager1, manager2, developer1, developer2, developer3
        };
        
        System.out.println(EmployeeUtilities.generateSalaryReport(employees));
        
        // Demonstrate salary increment using utility method
        System.out.println("\n### APPLYING SALARY INCREMENT ###");
        EmployeeUtilities.applySalaryIncrement(developer1, 10);
        System.out.println("Updated Developer Info:");
        EmployeeUtilities.displayDeveloperInfo(developer1);
        
        // Additional modification demonstration
        System.out.println("\n\n### MODIFYING EMPLOYEE DETAILS ###");
        System.out.println("Changing " + developer3.getName() + "'s project assignment...");
        developer3.setProjectAssignment("Cloud Infrastructure Migration");
        System.out.println("New Project: " + developer3.getProjectAssignment());
        
        System.out.println("\nIncreasing " + manager2.getName() + "'s team size...");
        manager2.setTeamSize(4);
        manager2.addTeamMember(3, "Nikhil Kumar");
        System.out.println("New Team Size: " + manager2.getTeamSize());
        
        // Final summary
        System.out.println("\n\n========================================");
        System.out.println("  Assignment Completed Successfully!");
        System.out.println("========================================");
        System.out.println("\nKey Concepts Demonstrated:");
        System.out.println("✓ Package structure (com.haryana.assignment)");
        System.out.println("✓ Access modifiers (private, protected, public)");
        System.out.println("✓ Inheritance (Manager and Developer extend Employee)");
        System.out.println("✓ Encapsulation (getters and setters)");
        System.out.println("✓ Javadoc documentation");
        System.out.println("✓ Utility methods for employee operations");
        System.out.println("\n========================================\n");
    }
}