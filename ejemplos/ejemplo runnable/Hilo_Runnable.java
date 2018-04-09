package Hilo;

public class Hilo_Runnable implements Runnable {
    private String _argumento;
    private Thread _hilo;

    public Hilo_Runnable(String argumento) {
        this._argumento = argumento;
        _hilo = new Thread(this, argumento);
        _hilo.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(_argumento + " iteracion: " + i);
                Thread.sleep((long) Math.random() * 1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Fin del hilo: " + _hilo);

    }
}
