package Task24;

public class LibraryManagement {
    private int booksAvailable = 3;

    public synchronized void borrowBook(String studentName) {
        if (booksAvailable > 0) {
            System.out.println(studentName + " is borrowing a book...");
            booksAvailable--;
            System.out.println("Book borrowed! Books left: " + booksAvailable);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(studentName + " tried to borrow but no books are available!");
        }
    }

    public synchronized void returnBook(String studentName) {
        System.out.println(studentName + " is returning a book...");
        booksAvailable++;
        System.out.println("Book returned! Books now available: " + booksAvailable);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Student extends Thread {
    private LibraryManagement library;
    private String studentName;

    public Student(LibraryManagement library, String studentName) {
        this.library = library;
        this.studentName = studentName;
    }

    @Override
    public void run() {
        library.borrowBook(studentName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        library.returnBook(studentName);
    }
}
