package module1.animals.classes;

import module1.animals.abstracts.Mammal;

public class Cat extends Mammal {
    static final boolean isPurring = true;
    static final boolean hasFur = true;

    public Cat(short age, float weight) {
        super(age, weight);
    }

    public void getInfo() {
        System.out.println(
                "Some info about cat:" +
                "\nisPurring: " + isPurring +
                "\nhasFur: " + hasFur +
                "\nage: " + this.age + " years" +
                "\nweight: " + this.weight + " kg"
        );
        System.out.println();
    }
}
