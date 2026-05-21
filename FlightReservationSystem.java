public class FlightReservationSystem {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   FLIGHT RESERVATION SYSTEM SIMULATOR  ");
        System.out.println("========================================\n");

        Flight flight = new Flight("AI-202", 5);

        Passenger p1 = new Passenger("Aman",   "P001");
        Passenger p2 = new Passenger("Rahul",  "P002");
        Passenger p3 = new Passenger("Priya",  "P003");
        Passenger p4 = new Passenger("Sneha",  "P004");
        Passenger p5 = new Passenger("Vikram", "P005");
        Passenger p6 = new Passenger("Riya",   "P006");
        Passenger p7 = new Passenger("Aman",   "P001");

        System.out.println();

        System.out.println("--- Booking Passengers ---");
        flight.bookSeat(p1);
        flight.bookSeat(p2);
        flight.bookSeat(p3);
        flight.bookSeat(p4);
        flight.bookSeat(p5);

        System.out.println();

        System.out.println("--- Attempting Extra Bookings ---");
        flight.bookSeat(p6);
        flight.bookSeat(p7);

        flight.displaySeatStatus();

        System.out.println("\n--- Booking Summary ---");
        System.out.println("Flight      : " + flight.getFlightNumber());
        System.out.println("Booked Seats: " + flight.getBookedCount());
        System.out.println("Available   : " + flight.getAvailableSeats());
        System.out.println("\n========================================");
        System.out.println("         Simulation Complete            ");
        System.out.println("========================================");
    }
}