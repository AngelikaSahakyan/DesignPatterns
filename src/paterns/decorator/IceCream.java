package paterns.decorator;

interface Icecream {
    String makeIcecream();
}

class SimpleIcecream implements Icecream {

    @Override
    public String makeIcecream() {
        return "Base IceCream";
    }

}

class IcecreamDecorator implements Icecream {
    Icecream specialIcecream;

    public IcecreamDecorator(Icecream specialIcecream) {
        this.specialIcecream = specialIcecream;
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream();
    }
}

class NuttyDecorator extends IcecreamDecorator {

    public NuttyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addNuts();
    }

    private String addNuts() {
        return " + cruncy nuts";
    }
}

class HoneyDecorator extends IcecreamDecorator {

    public HoneyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addHoney();
    }

    private String addHoney() {
        return " + sweet honey";
    }
}

class ChocolateDecorator extends IcecreamDecorator {
    public ChocolateDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    @Override
    public String makeIcecream() {
        return super.makeIcecream() + addChocolate();
    }

    public String addChocolate() {
        return " + chocolate";
    }
}

