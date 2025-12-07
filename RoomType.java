
public class RoomType {

    String type; //single, double, king, queen, suite

    public RoomType(String type) {
        this.type = type;
    }

    public int getOccupancy() {
        if (type.equals("single")) {
            return 2;
        } else if (type.equals("double")) {
            return 2;
        } else if (type.equals("king")) {
            return 3;
        } else if (type.equals("queen")) {
            return 3;
        }
        return 5;
    }

}
