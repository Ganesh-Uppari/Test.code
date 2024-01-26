package objectarrays;

import java.util.Objects;

public class Person {
    // Instance variables
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    // Constructor
    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Override equals method to match persons based on ssn
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(ssn, person.ssn);
    }

    // Main method (example usage)
    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person(170.0, 65.0, "123-45-6789", "123-456-7890");
        Person person2 = new Person(165.0, 60.0, "987-65-4321", "987-654-3210");
        Person person3 = new Person(175.0, 70.0, "123-45-6789", "555-555-5555");

        // Testing equality based on ssn
        System.out.println("person1 equals person2: " + person1.equals(person2)); // false
        System.out.println("person1 equals person3: " + person1.equals(person3)); // true
    }
}
