package module1.animals.classes;

import module1.animals.abstracts.Mammal;
import module1.animals.interfaces.LivesInWater;

public class Whale extends Mammal implements LivesInWater {
    public Whale(short age, float weight) {
        super(age, weight);
    }

    @Override
    public void livesInWater() {
        System.out.println("Whale lives in water");
    }

    public void getInfo() {
        System.out.println(
                "Some info about whale:" +
                        "\nage: " + this.age + " years" +
                        "\nweight: " + this.weight + " kg"
        );
        this.livesInWater();
        System.out.println();
    }
}
