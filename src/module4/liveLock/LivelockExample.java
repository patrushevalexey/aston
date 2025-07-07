package module4.liveLock;

public class LivelockExample {

    static class Worker {
        private volatile boolean active = true;

        public boolean isActive() {
            return active;
        }

        public void work(Worker other) {
            while (active) {
                if (other.isActive()) {
                    System.out.println(Thread.currentThread().getName() + ": waiting");
                    try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                    continue;
                }
                System.out.println(Thread.currentThread().getName() + ": waiting");
                break;
            }
        }

        public void setActive(boolean active) {
            this.active = active;
        }
    }

    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();

        Thread t1 = new Thread(() -> w1.work(w2), "Worker-1");
        Thread t2 = new Thread(() -> w2.work(w1), "Worker-2");

        t1.start();
        t2.start();
    }
}
