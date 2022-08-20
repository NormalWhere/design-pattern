package factories;

import animals.Quackble;

public abstract class AbstractDuckFactory {
    public abstract Quackble createMallardDuck();
    public abstract Quackble createRedheadDuck();
    public abstract Quackble createDuckCall();
    public abstract Quackble createRubberDuck();
}
