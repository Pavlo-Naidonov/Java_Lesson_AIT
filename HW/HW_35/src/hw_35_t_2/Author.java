package hw_35_t_2;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;
    private int year;

    public Author(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return year == author.year && Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, year);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                '}';
    }
}
