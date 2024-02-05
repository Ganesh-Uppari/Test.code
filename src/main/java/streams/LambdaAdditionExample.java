package streams;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaAdditionExample {
    public static void main(String[] args) {
        // Implementing the MathOperation interface using a lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Using the lambda expression to perform addition
        int result = addition.operate(5, 3);

        // Displaying the result
        System.out.println("Result of addition: " + result);
    }
}
