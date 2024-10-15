package paquete;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread h1 = new Thread(new Hilo("H1"));
        Thread h2 = new Thread(new Hilo("H2"));
        Thread h3 = new Thread(new Hilo("H3"));
        Thread h4 = new Thread(new Hilo("H4"));
        Thread h5 = new Thread(new Hilo("H5"));
        Thread h6 = new Thread(new Hilo("H6"));

        h1.start();
        h2.start();
        h1.join();
        h2.join();
        h3.start();
        h3.join();
        h4.start();
        h4.join();
        h5.start();
        h6.start();
        h5.join();
        h6.join();

        System.out.println("Hilo principal terminado");
    }

//    public static void main(String[] args){
//
//        for(int i=0; i<10;i++){
//            Saludo s = new Saludo(i+1);
//            s.start();
//
//        }
//        System.out.println("####### FIN DE LA EJECICIÓN DEL PROGRAMA #######");
//    }
}
