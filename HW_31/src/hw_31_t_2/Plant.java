package hw_31_t_2;

class Plant {
    protected double height = 0;

    public void spring() {}
    public void summer() {}
    public void autumn() {}
    public void winter() {}

    public void year() {
        spring();
        summer();
        autumn();
        winter();
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return "Растение";
    }

    public double getMaxHeight() {
        return 0;
    }
}
