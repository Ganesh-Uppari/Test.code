package arrayList;

import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    // You can override the toString method to customize the string representation of the object
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class RemoveLowGPAStudents {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ramyasri", "Bangari", 3.5));
        studentList.add(new Student("Ganesh", "Uppari", 3.2));
        studentList.add(new Student("Nikhil", "Bolgam", 4.0));
        studentList.add(new Student("Jeevan", "Chuka", 2.8));

        // Display the original list of students
        System.out.println("Original List of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Calculate the average GPA
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.gpa;
        }
        double averageGPA = totalGPA / studentList.size();

        // Remove students with GPA less than the average GPA
        studentList.removeIf(student -> student.gpa < averageGPA);

        // Display the remaining list of students
        System.out.println("\nRemaining List of Students (GPA >= Average GPA):");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
