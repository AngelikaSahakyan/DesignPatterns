package paterns.singleton;

/**
 * Singleton design pattern is used
 * when you want to have only one instance of a given class.
 * It is a Creational design pattern
 */

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.setColor("Black");
        System.out.println(singleton1.getColor() + " " + singleton2.getColor());
    }
}
