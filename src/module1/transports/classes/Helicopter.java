package module1.transports.classes;

import module1.transports.abstracts.Transport;
import module1.transports.interfaces.CarriesCargo;
import module1.transports.interfaces.HasPropeller;
import module1.transports.interfaces.HasWheels;

public class Helicopter extends Transport implements CarriesCargo, HasPropeller, HasWheels {
    public Helicopter() {
        super("Helicopter");
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
}
