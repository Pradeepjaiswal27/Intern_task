package Task21;

import java.util.*;

public class Iterator {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Rupali");
        students.add("Sonali");
        students.add("Himanshu");
        students.add("Hitesh");
        students.add("Gaurav");
        students.add("Nitesh");
        students.add("Amit");
        students.add("Anu");

        System.out.println("Student names:");
        for (String student : students) {
            System.out.println(student);
        }

        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println("\nStudent names after removal:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
