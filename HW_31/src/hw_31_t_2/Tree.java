package hw_31_t_2;

class Tree extends Plant {
    public Tree() {
        height = 1.5;
    }

    @Override
    public void spring() { height += 15; }
    @Override
    public void summer() { height += 15; }
    @Override
    public void autumn() { height += 5; }
    @Override
    public void winter() { height += 5; }

    @Override
    public String getName() { return "Дерево"; }
    @Override
    public double getMaxHeight() { return 5; }
}
