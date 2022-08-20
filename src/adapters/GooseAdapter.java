package adapters;


import animals.Goose;
import animals.Quackble;

public class GooseAdapter implements Quackble {
    private Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void qauck() {
        goose.honk();
    }
}
