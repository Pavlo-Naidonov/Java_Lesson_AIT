package hw_31_t_2;

class Bush extends Plant {
    public Bush() {
        height = 40;
    }

    @Override
    public void spring() { height += 10; }
    @Override
    public void summer() { height += 10; }
    @Override
    public void autumn() { height += 3; }

    @Override
    public String getName() { return "Куст"; }
    @Override
    public double getMaxHeight() { return 1.5; }
}
