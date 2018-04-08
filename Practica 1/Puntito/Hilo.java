package Hilo;

/**
 *
 */
public class Hilo extends Thread {
    private String _argumento;
    private int _milisegundos;

    /**
     * @param args
     */
    public Hilo(String argumento,int milisegundos) {
        this._argumento = argumento;
        this._milisegundos = milisegundos;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(_argumento);
                try {
                    Thread.sleep(_milisegundos);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
