package Main;

import Hilo.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Hilo_Runnable h1 = new Hilo_Runnable("Hola mundo");
        h1.run();
    }
}
