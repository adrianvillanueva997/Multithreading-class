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
            System.out.println(_argumento);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
