package hw_45;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", "Lennon", 20, "lennon@gmail.com");
        Person paul = new Person("Paul", "McCartney", 80, "paul@gmail.com");
        Person ringo = new Person("Ringo", "Starr", 18, "ringo@gmail.com");

        List<BankAccount> accounts = List.of(
                new BankAccount(john, "DE199988643", 150_000),
                new BankAccount(paul, "DE199988644", 50),
                new BankAccount(ringo, "DE199988645", 80_000)
        );

        List<BankAccount> low = accounts.stream().filter(a -> a.getBalance() < 100).toList();
        System.out.println(low);

        List<Person> rich = accounts.stream().filter(a -> a.getBalance() > 10000).map(BankAccount::getOwner).toList();
        System.out.println(rich);

        List<BankAccount> young = accounts.stream().filter(a -> a.getOwner().getAge() < 21).toList();
        System.out.println(young);

        List<String> info = accounts.stream().filter(a -> a.getBalance() > 100_000)
                .map(a -> String.format("%s %s.;IBAN: %s;%s",
                        a.getOwner().getlName(),
                        a.getOwner().getfName().charAt(0),
                        a.getIBAN(),
                        a.getOwner().getEmail()))
                .toList();
        System.out.println(info);
    }
}