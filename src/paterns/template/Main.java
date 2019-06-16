package paterns.template;

/**
 * Template Method is a behavioral design pattern.
 * Template Method design pattern is used to create
 * a method stub and deferring some of
 * the steps of implementation to the subclasses.
 */

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Programmer();
        employee1.comeToWork();

        System.out.println();
        Employee employee2 = new Manager();
        employee2.comeToWork();
    }
}
