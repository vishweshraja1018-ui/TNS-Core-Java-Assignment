// Assignment Question - 3
// Program to calculate and display area of a circle

public class Circle {
    
    // Data members
    private double radius;
    private String colour;
    
    // Constant for Pi
    private static final double PI = 3.14159;
    
    // Method to get input for circle details
    public void getInput(double rad, String col) {
        this.radius = rad;
        this.colour = col;
    }
    
    // Method to calculate and display the area of circle
    public void calcArea() {
        double area = PI * radius * radius;
        System.out.println("--- Circle Details ---");
        System.out.println("Radius: " + radius);
        System.out.println("Colour: " + colour);
        System.out.println("Area of Circle: " + area + " square units");
        System.out.println();
    }
    
    // Main method
    public static void main(String[] args) {
        
        // Create first circle object
        Circle circle1 = new Circle();
        circle1.getInput(5.0, "Red");
        circle1.calcArea();
        
        // Create second circle object
        Circle circle2 = new Circle();
        circle2.getInput(7.5, "Blue");
        circle2.calcArea();
        
        // Create third circle object
        Circle circle3 = new Circle();
        circle3.getInput(3.0, "Green");
        circle3.calcArea();
    }
}
