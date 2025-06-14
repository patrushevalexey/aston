package module1.animals.classes;

import module1.animals.abstracts.Mammal;
//import module1.animals.interfaces.HasFur;

public class Cat extends Mammal /* implements HasFur */ {
    static final boolean isPurring = true;
    static final boolean hasFur = true;

    protected Cat(short age, float weight) {
        super(age, weight);
    }

//    Для разнообразия указал имплементацию интерфейса, но кажется что не ок управлять
//    такими значениями через интерфейс. Прошу дать ОС по бест практису.
//    @Override
//    public void hasFur() {
//        System.out.println("Cat has fur");
//    }
}
