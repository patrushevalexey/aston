package module1.transports.classes;

import module1.transports.abstracts.Transport;
import module1.transports.interfaces.CarriesCargo;
import module1.transports.interfaces.HasWheels;

public class Truck extends Transport implements HasWheels, CarriesCargo {
    public Truck() {
        super("Truck");
    }

    @Override
    protected void move() {
        System.out.println(this.name + "can move");
    }

    @Override
    public void carriesCargo() {
        System.out.println(this.name + "can carries cargo");
    }

    @Override
    public void hasWheels() {
        System.out.println(this.name + "has wheels");
    }
}
