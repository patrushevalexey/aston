package module1.animals.classes;

import module1.animals.abstracts.Mammal;
import module1.animals.interfaces.HasFur;

public class Bear extends Mammal implements HasFur {
    static final boolean isHibernation = true;

    protected Bear(short age, float weight) {
        super(age, weight);
    }

    @Override
    public void hasFur() {
        System.out.println("Bear has fur");
    }
}
