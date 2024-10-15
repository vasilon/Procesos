package paquete;

public class Main {
    public static void main(String[] args){

        Thread h1 = new Thread(new Hilo("H1"));
        Thread h2 = new Thread(new Hilo("H2"));
        Thread h3 = new Thread(new Hilo("H3"));
        Thread h4 = new Thread(new Hilo("H4"));
        Thread h5 = new Thread(new Hilo("h5"));
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
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
