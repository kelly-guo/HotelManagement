
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
        reservations.add(r);
        return r;
    }

    public List<Room> searchAvailable(LocalDate checkIn, LocalDate checkOut) {
        List<Room> res = new ArrayList<>();
        for (Room room : rooms) {
            boolean isAvailable = true;
            for (Reservation r : reservations) {
                if (r.getRoom() == room) {
                    boolean overlaps = r.getCheckIn().isBefore(checkOut) && r.getCheckOut().isAfter(checkIn);
                    if (overlaps) {
                        isAvailable = false;
                        break;
                    }
                }
            }
            if (isAvailable) {
                res.add(room);
            }
        }
        return res;
    }

    public void addRooms(Room room) {
        rooms.add(room);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

}
