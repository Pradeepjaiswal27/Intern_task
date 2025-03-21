package Basic.Task24;

public class Main {
    public static void main(String[] args) {
        LibarryManagement library = new LibraryManagement();

        Student s1 = new Student(library, "Alice");
        Student s2 = new Student(library, "Bob");
        Student s3 = new Student(library, "Charlie");
        Student s4 = new Student(library, "David");

        s1.start();
        s2.start();
        s3.start();
        s4.start();

        try {
            s1.join();
            s2.join();
            s3.join();
            s4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All students have finished borrowing and returning books.");
    }
}
