package Main;


public class Productor extends Thread {


    public Productor() {
    }

    @Override
    public void run() {
        int numero;
        try {
            //System.out.println("El productor está pidiendo permiso.");
            Main.sem1.acquire(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        while (Main.i < Main.buffer.length) {
            numero = (int) (Math.random() * 5);
            System.out.println("El productor ha producido el numero: " + numero);
            Main.buffer[Main.i] = numero;
            try {
                Main.sem2.release(1);
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e);
            }
            Main.i++;

        }

    }

}
