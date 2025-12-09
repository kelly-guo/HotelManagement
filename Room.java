
public class Room {

    private int roomNumber;
    private RoomType roomType;
    private boolean isAvailable;
    private double perNight;

    public Room(int roomNumber, RoomType roomType, boolean isAvailable, double perNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.perNight = perNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerNight() {
        return perNight;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public void available(boolean b) {
        isAvailable = b;
    }

}
