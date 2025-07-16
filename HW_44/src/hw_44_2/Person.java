package hw_44_2;

public class Person {
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private Address address;

    public Person(String fName, String lName, String email, String phone, Address address) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getFullName() {
        return fName + " " + lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }
}
