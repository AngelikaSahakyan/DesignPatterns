package paterns.decorator;

/**
 * Decorator allows behavior to be added to an individual object,
 * dynamically, without affecting the behavior of other
 * objects from the same class
 */

public class Main {
    public static void main(String args[]) {
        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        System.out.println(icecream.makeIcecream());

        icecream = new NuttyDecorator(new HoneyDecorator(new SimpleIcecream()));
        System.out.println(icecream.makeIcecream());

        icecream = new ChocolateDecorator(new HoneyDecorator(new SimpleIcecream()));
        System.out.println(icecream.makeIcecream());
    }
}
