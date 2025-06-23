package app;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Jack", 20);
        System.out.println(p1);

        p1.age = -10;
        System.out.println(p1);

        p1.name = "Oleg";

        Account account = new Account();
        account.balance= -10000000;
    }
}