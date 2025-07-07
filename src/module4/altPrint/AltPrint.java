package module4.altPrint;

public class AltPrint {
    private static final Object lock = new Object();
    private static boolean isOneTurn = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!isOneTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException ignored) {}
                    }
                    System.out.print("1 ");
                    isOneTurn = false;
                    lock.notifyAll();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (isOneTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException ignored) {}
                    }
                    System.out.print("2 ");
                    isOneTurn = true;
                    lock.notifyAll();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
