package module1.animals.classes;

import module1.animals.abstracts.Mammal;
import module1.animals.interfaces.LivesInWater;

public class Whale extends Mammal implements LivesInWater {
    protected Whale(short age, float weight) {
        super(age, weight);
    }

    @Override
    public void livesInWater() {
        System.out.println("Whale lives in water");
    }
}
