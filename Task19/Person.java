/*Immutable Class: Person
Create an immutable class Person to represent a person with the following attributes:
firstName (String)
lastName (String)
dateOfBirth (LocalDate)
Make the class immutable:
Declare all fields as final.
Use a constructor to initialize all fields.
Do not provide any setter methods.
Implement the following methods:
String getFullName(): Returns the full name of the person (e.g., "John Doe").
int getAge(): Calculates and returns the current age of the person based on the dateOfBirth.*/

package Task19;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.Scanner;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        if (firstName == null || lastName == null || dateOfBirth == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                dateOfBirth.equals(person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter date of birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();

        LocalDate dateOfBirth = LocalDate.parse(dobInput);

        Person person = new Person(firstName, lastName, dateOfBirth);

        System.out.println("\nPerson Details:");
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
        System.out.println(person);

        scanner.close();
    }
}
