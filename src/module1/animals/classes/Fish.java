package module1.animals.classes;

import module1.animals.abstracts.Animal;
import module1.animals.interfaces.LivesInWater;

public class Fish extends Animal implements LivesInWater {
    protected Fish(short age, float weight) {
        super(age, weight);
    }

    @Override
    public void livesInWater() {
        System.out.println("Fish lives in water");
    }
}
