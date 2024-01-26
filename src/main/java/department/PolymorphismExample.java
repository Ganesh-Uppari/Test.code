package department;

// Abstract class poly.Department
abstract class Department {
    // Abstract method
    public abstract int getDepartmentSize();
}

// Subclass of poly.Department
class ITDepartment extends Department {
    private final int employees;

    // Constructor
    public ITDepartment(int employees) {
        this.employees = employees;
    }

    // Implementation of abstract method
    @Override
    public int getDepartmentSize() {
        return employees;
    }
}

// Class Product
class Product {
    // Instance variable
    private double price;

    // Getter and setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overloaded method for price getter
    public double getPrice(int quantity) {
        return price * quantity;
    }
}

/**
 *
 */
// Main class to illustrate runtime polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        // Runtime polymorphism with abstract class and subclass
        Department department = new ITDepartment(50);
        System.out.println("poly.Department Size: " + department.getDepartmentSize());

        // Runtime polymorphism with class and method overloading
        Product laptop = new Product();
        laptop.setPrice(1000.0);

        // Using the overloaded method based on quantity
        double totalPrice = laptop.getPrice(3);
        System.out.println("Total Price for 3 laptops: $" + totalPrice);
    }
}
