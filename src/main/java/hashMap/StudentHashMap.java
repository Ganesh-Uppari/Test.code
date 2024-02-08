package hashMap;

import java.util.HashMap;

class Student {
    private String FirstName;
    private String LastName;
    private double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

public class StudentHashMap {
    public static void main(String[] args) {
        // Create HashMap of students
        HashMap<String, Student> studentMap = new HashMap<>();

        // Populate the HashMap
        studentMap.put("Ganesh", new Student("Ganesh", "Uppari", 3.5));
        studentMap.put("Ramyasri", new Student("Ramyasri", "Bangari", 4.0));
        studentMap.put("John", new Student("John", "Bolgam", 3.8));
        studentMap.put("Nikhil", new Student("Nikhil", "Thota", 3.7));
        studentMap.put("Naresh", new Student("Naresh", "Uppari", 3.9));
        studentMap.put("Laxmi", new Student("Laxmi", "Uppari", 3.6));
        studentMap.put("Pavan", new Student("Pavan", "Uppari", 3.2));
        studentMap.put("Chinnu", new Student("Chinnu", "Bangari", 4.0));

        // Get a student by name
        Student foundStudent = getStudentByName("Chinnu" , studentMap);

        // Print the found student
        System.out.println(foundStudent);
    }

    public static Student getStudentByName(String name, HashMap<String, Student> studentMap) {
        return studentMap.get(name);
    }
}
