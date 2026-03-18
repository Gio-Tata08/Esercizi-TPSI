import java.util.LinkedList;
import java.util.Queue;

public class Stiva{
    private final int max = 2;
    private Queue<Bottino> bottinoQ = new LinkedList<>();
    
    public synchronized void deposita(Bottino bottino)throws InterruptedException{
       while(bottinoQ.size() == this.max) {
            System.out.println("il pirata non può depositare");
            //la wait sta dentro un ciclo while perchè è necessario ricontrollare la condizione che la stiva non sia piena una volta che viene rinotificato il Thread
            //se ci fosse stato un if, alla notifica del Thread, andava avanti nel codice anche se è la stiva fosse piena
            wait();
        }
            bottinoQ.add(bottino);
            System.out.println("il bottino è stato depositato: " + bottino.getBottino());
            
            notifyAll();
    }
    public synchronized void preleva()throws InterruptedException{
        while(bottinoQ.isEmpty()) {
            System.out.println("lo scrivano non può prelevare");
            wait();
        }
            Bottino bottino = bottinoQ.poll();
            System.out.println("il bottino è stato prelevato: " + bottino.getBottino());
            notifyAll();
    }
}