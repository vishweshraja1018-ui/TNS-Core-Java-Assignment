// Assignment Question - 1
// Program to display student details

public class StudentDetails {
    
    // Data members
    private String fullName;
    private String rollNumber;
    private String grade;
    private double percentage;
    
    // Method to input student details
    public void inputDetails(String name, String roll, String grde, double percent) {
        this.fullName = name;
        this.rollNumber = roll;
        this.grade = grde;
        this.percentage = percent;
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println(fullName);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage + "%");
    }
    
    // Main method
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails();
        
        // Sample input
        student.inputDetails("Ayan S", "5220365", "A", 9.5);
        
        // Display details
        student.displayDetails();
    }
}
