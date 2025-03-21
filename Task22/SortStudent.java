package Task22;

import java.util.*;

public class SortStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("sumit", 28, 103));
        students.add(new Student("sailendra", 24, 101));
        students.add(new Student("sachin", 21, 102));
        students.add(new Student("satendra", 29, 104));
        students.add(new Student("anil", 22, 105));
        students.add(new Student("pradeep", 18, 107));
        students.add(new Student("rahul", 16, 109));

        Collections.sort(students);
        System.out.println("Sorted by Name (Natural Order):");
        students.forEach(System.out::println);

        Collections.sort(students, new AgeComparator());
        System.out.println("\nSorted by Age:");
        students.forEach(System.out::println);

        Collections.sort(students, new RollNumberComparator());
        System.out.println("\nSorted by Roll Number:");
        students.forEach(System.out::println);
    }
}
