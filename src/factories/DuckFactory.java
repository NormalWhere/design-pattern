package factories;


import animals.*;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackble createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackble createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackble createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackble createRubberDuck() {
        return new RubberDuck();
    }
}