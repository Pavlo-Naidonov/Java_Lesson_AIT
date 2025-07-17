package app;

public class Duck implements Swimmable{
    private String name;
    private String color;

    public Duck(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void swim(){
        System.out.println(name + ": поплыла по озеру!");
    }
}
