package objectarrays;

public class Product implements Comparable<Product> {
    // Instance variables
    private double weight;
    private double price;
    private int id;

    // Constructor
    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    // Getter methods
    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    // Comparable interface implementation (compare based on price)
    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }

    // Main method (example usage)
    public static void main(String[] args) {
        // Creating instances of the Product class
        Product product1 = new Product(1.5, 20.0, 101);
        Product product2 = new Product(2.0, 15.0, 102);

        // Comparing products based on price
        int result = product1.compareTo(product2);

        // Displaying the comparison result
        if (result < 0) {
            System.out.println("Product 1 is cheaper than Product 2.");
        } else if (result > 0) {
            System.out.println("Product 1 is more expensive than Product 2.");
        } else {
            System.out.println("Product 1 and Product 2 have the same price.");
        }
    }
}
