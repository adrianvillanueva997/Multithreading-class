package Hilo;

/**
 *
 */
public class Hilo extends Thread {
    private String _argumento;

    /**
     * @param args
     */
    public Hilo(String args) {
        this._argumento = args;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(_argumento + " iteracion: " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
