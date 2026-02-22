// Custom Exception
class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String message) {
        super(message);
    }
}

// Movie Class
class Movie {
    String movieName;
    int availableSeats;

    public Movie(String name, int seats) {
        this.movieName = name;
        this.availableSeats = seats;
    }

    public void bookTicket(int seats) throws SeatNotAvailableException {
        if (seats > availableSeats) {
            throw new SeatNotAvailableException("Not enough seats available!");
        }

        availableSeats -= seats;
        System.out.println(seats + " seat(s) booked successfully.");
        System.out.println("Seats remaining: " + availableSeats);
    }
}

// Main Class
public class MovieBookingSystem {
    public static void main(String[] args) {

        Movie movie = new Movie("Avengers", 5);

        try {
            movie.bookTicket(3);
            movie.bookTicket(4);
        } catch (SeatNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}

