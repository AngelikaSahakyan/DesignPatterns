package paterns.singleton;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton("White");
    private String color;

    private Singleton(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public String getColor() {
        return color;
    }
}


