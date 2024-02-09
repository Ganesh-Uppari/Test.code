package threads;

public class DeadlockExample {
    // Object representing the first resource
    private static final Object resource1 = new Object();
    // Object representing the second resource
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        // Thread 1: Tries to lock resource1 and then resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource1");
                try {
                    Thread.sleep(100); // Intentional delay to make deadlock more likely
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for resource2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource2");
                }
            }
        });

        // Thread 2: Tries to lock resource2 and then resource1
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource2");
                try {
                    Thread.sleep(100); // Intentional delay to make deadlock more likely
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for resource1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource1");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // If the program reaches here, it means the threads have finished
        System.out.println("Both threads have finished execution.");
    }
}
