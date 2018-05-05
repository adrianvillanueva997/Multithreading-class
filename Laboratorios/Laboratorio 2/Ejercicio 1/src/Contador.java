import java.util.concurrent.Semaphore;

public class Contador {

    static final int NITER = 1000000;
    static volatile int count = 0;
    public static volatile Semaphore sem1 = new Semaphore(0);

    public static void main(String[] args) throws InterruptedException {
        Tarea hl = new Tarea("h1", 0);
        Tarea h2 = new Tarea("h2", 1);
        hl.start();
        h2.start();
        hl.join();
        h2.join();
        if (count < 2 * NITER)
            System.out.println("\n" + " BOOM! count es " + count + " deberia ser " + 2 * NITER);
        else
            System.out.println("\n" + " OK! count es " + count);
    }

}
