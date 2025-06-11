package module1.animals.abstracts;

public class Mammal extends Animal {
    final boolean hasSpine = true;

    protected Mammal(short age, float weight) {
        super(age, weight);
    }
}
