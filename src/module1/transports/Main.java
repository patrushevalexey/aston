package module1.transports;

import module1.transports.abstracts.Transport;
import module1.transports.classes.*;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
                new Helicopter(),
                new Plane(),
                new Speedboat(),
                new Tanker(),
                new Taxi(),
                new Truck()
        };

        for (Transport transport:transports) {
            transport.getInfo();
        }
    }
}
