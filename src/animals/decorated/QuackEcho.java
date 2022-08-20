package animals.decorated;

import animals.Quackble;

public class QuackEcho implements Quackble {
    private Quackble duck;

    public QuackEcho(Quackble duck) {
        this.duck = duck;
    }
    @Override
    public void qauck() {
        duck.qauck();

        System.out.println("Echo:");
        duck.qauck();
    }
}
