package Main;

public class Consumidor extends Thread {

    public Consumidor() {

    }

    @Override
    public void run() {
        Main.sem1.release(1);
        int numero;
        int i = 0;
        try {
            Main.sem2.acquire(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (Main.i < Main.buffer.length) {
            numero = Main.buffer[Main.i];
            System.out.println("El consumidor obtiene el numero: " + numero);
            try {
                Main.sem1.release(0);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
