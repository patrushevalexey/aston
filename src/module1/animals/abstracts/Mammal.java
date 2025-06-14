package module1.animals.abstracts;

public class Mammal extends Animal {
    protected final boolean hasSpine = true;

    protected Mammal(short age, float weight) {
        super(age, weight);
    }
}
