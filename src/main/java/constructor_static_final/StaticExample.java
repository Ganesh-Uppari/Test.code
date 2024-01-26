package constructor_static_final;

public class StaticExample {
    // Static variable
    private static int staticVariable;

    // Static method that returns an int
    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void main(String[] args) {
        // Set the value of the static variable
        staticVariable = 42;

        // Call the static method and print the result
        int result = getStaticVariable();
        System.out.println("Static Variable Value: " + result);
    }
}
