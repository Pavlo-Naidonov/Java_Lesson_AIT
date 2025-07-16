package hw_44_2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static List<String> convertPersonList(List<Person> people, PersonToString converter) {
        return people.stream()
                .map(converter::personToString)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", "Doe", "john@example.com", "12345",
                        new Address("12345", "Berlin", "Mainstr", "10")),
                new Person("Jane", "Smith", "jane@example.com", "67890",
                        new Address("67890", "Munich", "Secondstr", "5"))
        );

        System.out.println("FIO:");
        convertPersonList(people, p -> p.getFullName()).forEach(System.out::println);

        System.out.println("\nEmail:");
        convertPersonList(people, Person::getEmail).forEach(System.out::println);

        System.out.println("\nPhone:");
        convertPersonList(people, Person::getPhone).forEach(System.out::println);

        System.out.println("\nAddress:");
        convertPersonList(people, p -> p.getAddress().toString()).forEach(System.out::println);
    }
}
