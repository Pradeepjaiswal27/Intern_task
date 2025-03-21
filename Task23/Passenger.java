package Basic.Task23;

public class Passenger {
    public static void main(String[] args) {
        Ticket bookingSystem = new Ticket();

        // Creating multiple passenger threads
        Passenger p1 = new Passenger(bookingSystem, "Pradeep", 2);
        Passenger p2 = new Passenger(bookingSystem, "Sachin", 13);
        Passenger p3 = new Passenger(bookingSystem, "satendra", 1);
        Passenger p4 = new Passenger(bookingSystem, "shubham", 2);

        // Start booking (each thread runs independently)
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
