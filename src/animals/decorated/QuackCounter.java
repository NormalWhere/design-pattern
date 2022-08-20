package animals.decorated;

import animals.Quackble;

public class QuackCounter implements Quackble {
    private Quackble duck;
    private static int numberOfQuacks;

    public QuackCounter(Quackble duck) {
        this.duck = duck;
    }
    @Override
    public void qauck() {
        duck.qauck();

        numberOfQuacks++;
    }
    public static int getQuacks() {
        return numberOfQuacks;
    }
}
