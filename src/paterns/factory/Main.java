package paterns.factory;

/**
 * Factory pattern “defines an interface for creating an object,
 * but let subclasses decide which class to instantiate.
 * The Factory method lets a class defer instantiation to subclasses”.
 */

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}
