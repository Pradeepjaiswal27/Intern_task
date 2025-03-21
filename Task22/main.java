package Task22;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<StudentObj> students = new ArrayList<>();
        students.add(new StudentObj(1, "sumit", 20, "A"));
        students.add(new StudentObj(2, "shailendra", 21, "B"));
        students.add(new StudentObj(3, "sachin", 19, "A"));
        students.add(new StudentObj(4, "pradeep", 22, "C"));
        students.add(new StudentObj(5, "satendra", 20, "B"));

        for (StudentObj student : students) {
            System.out.println(student);
        }
    }
}
