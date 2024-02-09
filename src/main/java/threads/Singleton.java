package threads;

public class Singleton {

    // Private static instance variable of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    }

    // Public static method to provide the global point of access to the singleton instance
    public static Singleton getInstance() {
        // If the instance is null, create a new instance
        if (instance == null) {
            instance = new Singleton();
        }
        // Return the singleton instance
        return instance;
    }

    // Example method of the singleton class
    public void showMessage() {
        System.out.println("Hello, I am a singleton instance!");
    }

    public static void main(String[] args) {
        // Access the singleton instance using the getInstance() method
        Singleton singletonInstance = Singleton.getInstance();
        // Call a method on the singleton instance
        singletonInstance.showMessage();
    }
}
