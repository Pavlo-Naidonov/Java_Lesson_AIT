package Mail_Delivery;

public class DHL implements MailDeliveryService{
    @Override
    public void sendEmail() {
        System.out.println("Положи письмо в конверт, поставь марку, отправь.");
    }
}
