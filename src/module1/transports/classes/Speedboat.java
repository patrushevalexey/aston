package module1.transports.classes;

import module1.transports.abstracts.Transport;
import module1.transports.interfaces.CarriesCargo;
import module1.transports.interfaces.HasPropeller;

public class Speedboat extends Transport implements CarriesCargo, HasPropeller {
    public Speedboat() {
        super("Speedboat");
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

    public void getInfo() {
        this.move();
        this.carriesCargo();
        this.hasPropeller();
        System.out.println();
    }
}
