
public class Customer {

    private String name;
    private int customerId;
    private String phone;
    private String email;

    public Customer(String name, int customerId, String phone, String email) {
        this.name = name;
        this.customerId = customerId;
        this.phone = phone;
        this.email = email;
    }

    public String getContact() {
        return "Name: " + name + " Phone: " + phone + " Email: " + email;
    }

}
