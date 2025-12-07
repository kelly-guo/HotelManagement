
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private int reservationId;
    private Customer customer;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String status; //Confirmed, Cancelled

    public Reservation(int reservationId, Customer customer, Room room, LocalDate checkIn, LocalDate checkOut, String status) {
        this.reservationId = reservationId;
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

}
