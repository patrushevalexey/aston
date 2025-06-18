package module1.transports.abstracts;

 public abstract class Transport {
     protected String name;

     public Transport(String name) {
         this.name = name;
     }

     protected abstract void move();

     public abstract void getInfo();
}
