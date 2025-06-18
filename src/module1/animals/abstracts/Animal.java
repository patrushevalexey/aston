package module1.animals.abstracts;

public abstract class Animal {
    protected short age;
    protected float weight;

    protected Animal(short age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public void getInfo() {};
}
