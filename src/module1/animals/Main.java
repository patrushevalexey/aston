package module1.animals;

import module1.animals.abstracts.Animal;
import module1.animals.classes.Bear;
import module1.animals.classes.Cat;
import module1.animals.classes.Fish;
import module1.animals.classes.Whale;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Bear((short) 15, 120),
                new Cat((short) 4, 3.456f),
                new Fish((short) 1, 0.2f),
                new Whale((short) 25, 40000)
        };

        for (Animal animal : animals) {
            animal.getInfo();
        }
    }
}
