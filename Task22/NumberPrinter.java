package Task22;

class NumberPrinter {
    private int number = 1;
    private final int limit;
    private final Object lock = new Object();

    public NumberPrinter(int limit) {
        this.limit = limit;
    }

    public void printOdd() {
        synchronized (lock) {
            while (number < limit) {
                if (number % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd: " + number);
                number++;
                lock.notify();
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (number <= limit) {
                if (number % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even: " + number);
                number++;
                lock.notify();
            }
        }
    }
}
