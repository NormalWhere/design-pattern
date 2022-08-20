package factories;


import animals.*;
import animals.decorated.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackble
    createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackble createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackble createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackble
    createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
