package module1.animals.classes;

import module1.animals.abstracts.Mammal;

public class Bear extends Mammal {
    static final boolean isHibernation = true;
    static final boolean hasFur = true;

    public Bear(short age, float weight) {
        super(age, weight);
    }

    public void getInfo() {
        System.out.println(
                "Some info about bear:" +
                        "\nisHibernation: " + isHibernation +
                        "\nhasFur: " + hasFur +
                        "\nage: " + this.age + " years" +
                        "\nweight: " + this.weight + " kg"
        );
        System.out.println();
    }
}
