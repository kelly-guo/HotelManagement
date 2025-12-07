
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Reservation> reservations;
    List<Customer> customers;
    List<Room> rooms;
    private String name;
    private String address;

    public Hotel(String name, String address) {
        reservations = new ArrayList<>();
        customers = new ArrayList<>();
        rooms = new ArrayList<>();
        this.name = name;
        this.address = address;
    }

    public Reservation bookReservation(LocalDate checkIn, LocalDate checkOut, Room room, Customer customer) {
        for (Reservation r : reservations) {
            if (r.getRoom().getRoomNumber() == room.getRoomNumber()) {
                boolean overlaps = !(r.getCheckOut().isBefore(checkOut) || r.getCheckOut().equals(checkOut) || checkOut.isBefore(r.getCheckOut()) || checkOut.equals(r.getCheckOut()));
                if (overlaps) {
                    return null;
                }
            }
        }
        Reservation r = new Reservation(customer, room, checkIn, checkOut, "Confirmed");
        return r;
    }

}
