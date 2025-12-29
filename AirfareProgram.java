// Interface Definition
public interface Airfare {
    double calculateAmount();
}

// AirIndia Class implementing Airfare
class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;
    
    // Default constructor
    public AirIndia() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }
    
    // Parameterized constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }
    
    // Getters
    public int getHours() {
        return hours;
    }
    
    public double getCostPerHour() {
        return costPerHour;
    }
    
    // Setters
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }
    
    // Override calculateAmount method from Airfare interface
    @Override
    public double calculateAmount() {
        return hours * costPerHour;
    }
}

// KingFisher Class implementing Airfare
class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;
    
    // Default constructor
    public KingFisher() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }
    
    // Parameterized constructor
    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }
    
    // Getters
    public int getHours() {
        return hours;
    }
    
    public double getCostPerHour() {
        return costPerHour;
    }
    
    // Setters
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }
    
    // Override calculateAmount method from Airfare interface
    // Multiply by 4 for KingFisher
    @Override
    public double calculateAmount() {
        return (hours * costPerHour) * 4;
    }
}

// Indigo Class implementing Airfare
class Indigo implements Airfare {
    private int hours;
    private double costPerHour;
    
    // Default constructor
    public Indigo() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }
    
    // Parameterized constructor
    public Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }
    
    // Getters
    public int getHours() {
        return hours;
    }
    
    public double getCostPerHour() {
        return costPerHour;
    }
    
    // Setters
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }
    
    // Override calculateAmount method from Airfare interface
    // Multiply by 8 for Indigo
    @Override
    public double calculateAmount() {
        return (hours * costPerHour) * 8;
    }
}

// Driver Class
public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        // Read choice
        int choice = sc.nextInt();
        
        // Read hours and costPerHour
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();
        
        Airfare airfare = null;
        
        // Select appropriate airline based on choice
        switch(choice) {
            case 1:
                // AirIndia
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                // KingFisher
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                // Indigo
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        
        // Calculate and display amount rounded to 2 decimal places
        double amount = airfare.calculateAmount();
        System.out.printf("%.2f%n", amount);
        
        sc.close();
    }
}
