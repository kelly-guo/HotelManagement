
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private int reservationId;
    private Customer customer;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String status; //Confirmed, Cancelled
    private static int nextId = 1000;

    public Reservation(Customer customer, Room room, LocalDate checkIn, LocalDate checkOut, String status) {
        reservationId = nextId;
        nextId++;

        this.customer = customer;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.status = status;
    }

    public long getNights() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public double getTotalCost() {
        int nights = (int) getNights();
        return room.getPricePerNight() * nights;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Room getRoom() {
        return room;
    }

    public int getId() {
        return reservationId;
    }

    public void setStatus(String s) {
        status = s;
    }

}
