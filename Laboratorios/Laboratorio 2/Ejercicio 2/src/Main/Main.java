package Main;

import java.util.concurrent.Semaphore;

public class Main {
    public static volatile Semaphore sem1 = new Semaphore(0);
    public static volatile Semaphore sem2 = new Semaphore(0);
    public static volatile int[] buffer = new int[5];
    public static volatile int i = 0;

    public static void main(String[] args) {
        Productor productor = new Productor();
        Consumidor consumidor = new Consumidor();

        productor.start();
        consumidor.start();

        productor.run();
        consumidor.run();
    }
}
