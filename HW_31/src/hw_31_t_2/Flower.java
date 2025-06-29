package hw_31_t_2;

class Flower extends Plant {
    public Flower() {
        height = 0;
    }

    @Override
    public void spring() { height += 7; }
    @Override
    public void summer() { height += 10; }
    @Override
    public void winter() { height = 0; }

    @Override
    public String getName() { return "Цветок"; }
    @Override
    public double getMaxHeight() { return 1; }
}
