package hw_34_t_1;

public class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Машина едет по дороге");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }
}
