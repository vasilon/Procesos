package paquete;

public class Saludo extends Thread{
    private int numHilo= 0;
    public Saludo(int numHilo) {
        this.numHilo = numHilo;
    }


        @Override
        public void run(){
            System.out.println("--- ARRANCA EL HILO Nº "+ numHilo);
            for (int i=0;i<10;i++){
                System.out.println("Hilo Nº "+ numHilo+ " te saluda(Vez: "+ (i+1)+ " )");

            }
            System.out.println("--- FIN DEL HILO Nº "+ numHilo);
        }


    }
