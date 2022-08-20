package animals.composites;

public class LeaderFlock extends Flock{
    public void quack() {
        for (int i = 0 ; i < quackers.size() ; ++i) {
            if (i == 0) {
                quackers.get(i).qauck();
                quackers.get(i).qauck();
                quackers.get(i).qauck();
            } else {
                quackers.get(i).qauck();
            }
        }
    }
}
