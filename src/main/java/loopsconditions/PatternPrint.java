package loopsconditions;

public class PatternPrint {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        for (int i = 4; i >= 0; i--) {
            // Print '+' characters
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("+");
            }

            // Print '-' characters
            for (int k = 0; k < i; k++) {
                System.out.print("-");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
