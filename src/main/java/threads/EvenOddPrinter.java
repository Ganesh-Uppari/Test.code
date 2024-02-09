package threads;

public class EvenOddPrinter {
    public static void main(String[] args) {
        // Create two threads for printing even and odd numbers
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}

// Runnable class to print even numbers
class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 60; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds to slow down printing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Runnable class to print odd numbers
class OddPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 59; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds to slow down printing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
