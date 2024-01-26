package student;

public class student {
    // Instance variable
    private String name;

    // Constructor
    public student(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Main method (example usage)
    public static void main(String[] args) {
        // Creating an instance of the Student class with a name
        student student1 = new student("ganesh uppari");

        // Using the getName method to retrieve the name
        String studentName = student1.getName();

        // Displaying the retrieved name
        System.out.println("Student Name: " + studentName);
    }
}
