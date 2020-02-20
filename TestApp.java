package main.java.busReservationApp;

public class TestApp {

    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter, "Mike", 2);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter, "John", 4);

        t1.start();
        t2.start();
    }
}
