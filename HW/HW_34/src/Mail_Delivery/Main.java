package Mail_Delivery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();

        System.out.println("Выберете способ доставки: dhl, email или pigeon");
        String choice = scanner.nextLine().toLowerCase();

        MailDeliveryService service;

        switch (choice){
            case "dhl":
                service = new DHL();
                break;
            case "email":
                service = new Email();
                break;
            case "pigeon":
                service = new Pigeon();
                break;
            default:
                System.out.println("Неверный вариант, используем голуба по умолчанию))");
                service = new Pigeon();
                break;
        }

        sender.send(service);
        scanner.close();
    }
}
