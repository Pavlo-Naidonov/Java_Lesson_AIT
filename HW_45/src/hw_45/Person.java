package hw_45;

public class Person {
    private String fName;
    private String lName;
    private int age;
    private String email;

    public Person(String fName, String lName, int age, String email) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
