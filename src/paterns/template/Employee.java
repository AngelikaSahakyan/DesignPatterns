package paterns.template;

public abstract class Employee {
    abstract void work();

    abstract void takePause();

    abstract void getPaid();

    final void comeToWork() {
        work();
        takePause();
        work();
        getPaid();
    }
}


class Programmer extends Employee {
    @Override
    void work() {
        System.out.println("Writing code.");
    }

    @Override
    void takePause() {
        System.out.println("Taking a small break from writing code.");
    }

    @Override
    void getPaid() {
        System.out.println("Getting paid for developing the project.");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Managing other employees.");
    }

    @Override
    void takePause() {
        System.out.println("Taking a small break from managing employees.");
    }

    @Override
    void getPaid() {
        System.out.println("Getting paid for overseeing the development of the project.");
    }
}