// Assignment Question - 2
// Student class with default constructor and Commission class

public class Student {
    
    // Default constructor
    public Student() {
        System.out.println("Student object is created");
    }
}

// Commission class for calculating sales employee commission
class Commission {
    
    // Data members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;
    private double commission;
    
    // Constructor
    public Commission() {
        this.commission = 0.0;
    }
    
    // Method to accept details of sales employee
    public void acceptDetails(String name, String address, String phone, double salesAmount) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salesAmount = salesAmount;
    }
    
    // Method to calculate commission based on sales amount
    public void calculateCommission() {
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;  // 10% commission
        } else if (salesAmount >= 50000 && salesAmount < 100000) {
            commission = salesAmount * 0.05;  // 5% commission
        } else if (salesAmount >= 30000 && salesAmount < 50000) {
            commission = salesAmount * 0.03;  // 3% commission
        } else {
            commission = 0.0;  // No commission
        }
    }
    
    // Method to display commission details
    public void displayCommission() {
        System.out.println("--- Commission Details ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: Rs." + salesAmount);
        System.out.println("Commission: Rs." + commission);
        System.out.println();
    }
    
    // Main method
    public static void main(String[] args) {
        
        // Create Student object (this will print "Student object is created")
        System.out.println("Creating Student object:");
        Student student = new Student();
        System.out.println();
        
        // Create Commission object
        Commission emp1 = new Commission();
        
        // Accept details and calculate commission
        emp1.acceptDetails("Rajesh Kumar", "123 Main Street, Chennai", "9876543210", 120000);
        emp1.calculateCommission();
        emp1.displayCommission();
        
        // Another example
        Commission emp2 = new Commission();
        emp2.acceptDetails("Priya Singh", "456 Park Avenue, Mumbai", "9123456789", 45000);
        emp2.calculateCommission();
        emp2.displayCommission();
        
        // Another example
        Commission emp3 = new Commission();
        emp3.acceptDetails("Amit Patel", "789 Business Road, Bangalore", "9988776655", 25000);
        emp3.calculateCommission();
        emp3.displayCommission();
    }
}
