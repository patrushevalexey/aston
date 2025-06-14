package module1.transports.classes;

import module1.transports.abstracts.Transport;
import module1.transports.interfaces.HasWheels;

public class Taxi extends Transport implements HasWheels {
    public Taxi() {
        super("Taxi");
    }

    @Override
    protected void move() {
        System.out.println(this.name + "can move");
    }

    @Override
    public void hasWheels() {
        System.out.println(this.name + "has wheels");
    }
}
