package loopsconditions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int N = 10;
        printFibonacciSeries(N);
    }

    public static void printFibonacciSeries(int N) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series up to " + N + " terms:");

        for (int i = 0; i < N; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
