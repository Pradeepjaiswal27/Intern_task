package Task23;

class Ticket {
    private int availableSeats = 13;

    public synchronized void bookTicket(String passengerName, int seats) {
        System.out.println(passengerName + " is trying to book " + seats + " seat(s).");

        if (seats <= availableSeats) {
            System.out.println("Booking confirmed for " + passengerName + " (" + seats + " seat(s)).");
            availableSeats -= seats;
        } else {
            System.out.println("Sorry, not enough seats available for " + passengerName + ".");
        }

        System.out.println("Seats left: " + availableSeats);
    }
}

class Passenger extends Thread {
    private TicketBooking bookingSystem;
    private String passengerName;
    private int seats;

    public Passenger(TicketBooking bookingSystem, String passengerName, int seats) {
        this.bookingSystem = bookingSystem;
        this.passengerName = passengerName;
        this.seats = seats;
    }

    public void run() {
        bookingSystem.bookTicket(passengerName, seats);
    }
}
