package module1.transports.classes;

import module1.transports.abstracts.Transport;
import module1.transports.interfaces.CarriesCargo;
import module1.transports.interfaces.HasPropeller;
import module1.transports.interfaces.HasWheels;
import module1.transports.interfaces.HasWings;

public class Plane extends Transport implements CarriesCargo ,HasPropeller, HasWheels, HasWings {

    public Plane() {
        super("Plane");
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
    public void hasPropeller() {
        System.out.println(this.name + "has propeller");
    }

    @Override
    public void hasWheels() {
        System.out.println(this.name + "has wheels");
    }

    @Override
    public void hasWings() {
        System.out.println(this.name + "has wings");
    }

    public void getInfo() {
        this.move();
        this.carriesCargo();
        this.hasPropeller();
        this.hasWheels();
        this.hasWings();
        System.out.println();
    }
}
