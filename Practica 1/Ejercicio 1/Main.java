import Hilo.Hilo;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hilo h1, h2, h3, h4, h5, h6, h7, h8, h9, h10;
        h1 = new Hilo("hilo 1");
        h2 = new Hilo("hilo 2");
        h3 = new Hilo("hilo 3");
        h4 = new Hilo("Hilo 4");
        h5 = new Hilo("Hilo 5");
        h6 = new Hilo("Hilo 6");
        h7 = new Hilo("Hilo 7");
        h8 = new Hilo("Hilo 8");
        h9 = new Hilo("Hilo 9");
        h10 = new Hilo("Hilo 10");
        h1.start();
        System.out.println("Creado hilo 1: " + h1);
        h2.start();
        System.out.println("Creado hilo 2: " + h2);
        h3.start();
        System.out.println("Creado hilo 3: " + h3);
        h4.start();
        System.out.println("Creado hilo 4: " + h4);
        h5.start();
        System.out.println("Creado hilo 5: " + h5);
        h6.start();
        System.out.println("Creado hilo 6: " + h6);
        h7.start();
        System.out.println("Creado hilo 7: " + h7);
        h8.start();
        System.out.println("Creado hilo 8: " + h8);
        h9.start();
        System.out.println("Creado hilo 9: " + h9);
        h10.start();
        System.out.println("Creado hilo 10: " + h10);
    }
}
