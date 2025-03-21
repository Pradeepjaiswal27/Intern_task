package Task22;

public class EvenOddThreads {
    public static void main(String[] args) {
        int limit = 60;
        NumberPrinter printer = new NumberPrinter(limit);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}
