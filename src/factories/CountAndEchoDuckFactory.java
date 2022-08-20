package factories;

import animals.*;
import animals.decorated.QuackCounter;
import animals.decorated.QuackEcho;

public class CountAndEchoDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackble createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackble createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackble createDuckCall() {
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackble createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}