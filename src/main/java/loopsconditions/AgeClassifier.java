package loopsconditions;

public class AgeClassifier {
    public static void main(String[] args) {
        // Example usage
        int age = 10;
        classifyPerson(age);
    }

    public static void classifyPerson(int age) {
        if (age < 13) {
            System.out.println("Person is a Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Person is a Teen");
        } else {
            System.out.println("Person is an Adult");
        }
    }
}
