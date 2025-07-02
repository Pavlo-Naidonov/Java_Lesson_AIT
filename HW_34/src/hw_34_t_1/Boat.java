package hw_34_t_1;

public class Boat implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Лодка плывет по воде");
    }

    @Override
    public void stop() {
        System.out.println("Лодка остановилась");
    }
}
