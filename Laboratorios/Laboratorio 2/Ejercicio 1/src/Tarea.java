public class Tarea extends Thread {
    String _argumentos;
    int _permiso;

    public Tarea(String args, int permiso) {
        this._argumentos = args;
        this._permiso = permiso;
    }

    public void run() {
        int tmp;
        System.out.println("El Hilo: " + _argumentos + " está esperando a ser autorizado.");
        try {
            Contador.sem1.acquire(_permiso);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El hilo: " + _argumentos + " ha sido autorizado.");
        for (int i = 0; i < Contador.NITER; i++) {
            tmp = Contador.count; /* copy the global count locally */
            tmp = tmp + 1; /* increment the local copy */
            Contador.count = tmp;
        }
        Contador.sem1.release(_permiso + 1);


    }
}
