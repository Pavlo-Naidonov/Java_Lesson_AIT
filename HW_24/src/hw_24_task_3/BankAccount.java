package hw_24_task_3;

public class BankAccount {
    String iban;
    double balance;
    Person owner;
    MyDate open;

    public BankAccount(String i, double b, Person o,MyDate op){
        iban = i;
        balance = b;
        owner = o;
        open = op;
    }


    //"DE123412341234  Н.Петров (19/10/1987) Счет открыт: 1/2/2025  Баланс 10345.10"
    public String getAccountInfo(){
        return iban + "  " +
                owner.firstName.charAt(0) + "." + owner.lastName + " (" +
                owner.birthday.day + "/" + owner.birthday.month + "/" + owner.birthday.year + ") " +
                "Счет открыт: " + open.day + "/" + open.month + "/" + open.year + " " +
                "Баланс " + String.format("%.2f", balance);
    }
}
