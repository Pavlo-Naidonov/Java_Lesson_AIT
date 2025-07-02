package Mail_Delivery;

public class Pigeon implements MailDeliveryService{

    @Override
    public void sendEmail() {
        System.out.println("Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю");
    }
}
