package Mail_Delivery;

public class Email implements MailDeliveryService{
    @Override
    public void sendEmail() {
        System.out.println("Отправить по Интернету.");
    }
}
