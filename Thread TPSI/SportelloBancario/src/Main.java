import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sportello sportello = new Sportello(2);
        ArrayList<Cliente> clienti = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            clienti.add(new Cliente(i,sportello));
        }
        for (Cliente cliente : clienti){
            cliente.start();
        }
        for (Cliente cliente : clienti){
            try {
                cliente.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}