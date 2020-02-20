package main.java.busReservationApp;

public class TicketCounter {

    private int availableSeats = 4;

    public synchronized void bookTicket(String pname, int numberOfSeats) {
        if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
            System.out.println("Hi, " + pname + " : " + numberOfSeats+ " seats booked successfully..");
            availableSeats = availableSeats- numberOfSeats;
        } else {
            System.out.println("Hi, " + pname + " : There are no seats available!");
            if(availableSeats > 0){
                System.out.println("There are only " + availableSeats + " seat/seats available.");
            }

        }
    }
}
