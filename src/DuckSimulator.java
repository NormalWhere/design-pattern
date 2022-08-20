import animals.*;
import animals.composites.LeaderFlock;
import factories.AbstractDuckFactory;
import factories.CountingDuckFactory;
import factories.DuckFactory;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulateCompositePattern2();

    }
    private void simulateCompositePattern2() {
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();

        Quackble mallardDuck = duckFactory.createMallardDuck();
        Quackble redHeadDuck = duckFactory.createRedheadDuck();
        Quackble duckCall = countingDuckFactory.createDuckCall();
        Quackble rubberDuck = countingDuckFactory.createRubberDuck();

        LeaderFlock flock = new LeaderFlock();
        flock.add(mallardDuck);
        flock.add(redHeadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);

        flock.quack();
    }
}
