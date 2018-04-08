public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hilo h1 = new Hilo("Hilo 1");
        Hilo h2 = new Hilo("Hilo 2");
        Hilo h3 = new Hilo("Hilo 3");
        Hilo h4 = new Hilo("Hilo 4");
        Hilo h5 = new Hilo("Hilo 5");
        Hilo h6 = new Hilo("Hilo 6");
        Hilo h7 = new Hilo("Hilo 7");
        Hilo h8 = new Hilo("Hilo 8");
        Hilo h9 = new Hilo("Hilo 9");


        Hilo array_hilo[] = new Hilo[10];
        array_hilo[0] = h1;
        array_hilo[1] = h2;
        array_hilo[2] = h3;
        array_hilo[3] = h4;
        array_hilo[4] = h4;
        array_hilo[5] = h5;
        array_hilo[6] = h6;
        array_hilo[7] = h7;
        array_hilo[8] = h8;
        array_hilo[9] = h9;

        try {
            for (Hilo hilo : array_hilo) {
                hilo.start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
