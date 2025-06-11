package module1.animals.classes;

import module1.animals.abstracts.Mammal;
import module1.animals.interfaces.HasFur;

public class Cat extends Mammal implements HasFur {
    static final boolean isPurring = true;

    protected Cat(short age, float weight) {
        super(age, weight);
    }

    @Override
    public void hasFur() {
        System.out.println("Cat has fur");
    }
}
