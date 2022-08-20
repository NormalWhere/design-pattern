package animals.composites;

import animals.Quackble;

import java.util.ArrayList;

public class Flock implements Quackble {
    ArrayList<Quackble> quackers = new ArrayList<>();

    public void add(Quackble quacker) {
        quackers.add(quacker);
    }

    @Override
    public void qauck() {
        for(Quackble quacker : quackers){
            quacker.qauck();
        }
    }
}
