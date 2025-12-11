
class Employee {

    private int employeeId;
    private String role;
    private String name;
    private double salary;

    public Employee(int employeeId, String role, String name, double salary) {
        this.employeeId = employeeId;
        this.role = role;
        this.name = name;
        this.salary = salary;
    }

    public void checkOut(Reservation r) {
        Room room = r.getRoom();
        room.available(true);
    }

    public void checkIn(Reservation r) {
        Room room = r.getRoom();
        room.available(false);
    }

}
