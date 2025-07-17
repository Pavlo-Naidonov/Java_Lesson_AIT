package hw_34_t_1;

public class Bike implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Велосипед едет по тропинке");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановился");
    }
}
