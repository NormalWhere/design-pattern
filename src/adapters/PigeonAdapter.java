package adapters;

import animals.Pigeon;
import animals.Quackble;

public class PigeonAdapter implements Quackble {
    private Pigeon pigeon;
    public PigeonAdapter (Pigeon pigeon){
        this.pigeon = pigeon;
    }


    @Override
    public void qauck() {
        pigeon.coo();
        pigeon.coo();
    }
}
