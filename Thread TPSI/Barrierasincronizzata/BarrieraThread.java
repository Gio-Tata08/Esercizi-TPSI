import java.util.Random;

public class BarrieraThread extends Thread{
    private Random rand = new Random();
    private BarrieraSincronizzata barrieraSincronizzata;

    public BarrieraThread(BarrieraSincronizzata barrieraSincronizzata){
        this.barrieraSincronizzata = barrieraSincronizzata;
    }

    @Override
    public void run(){
        try {
            int tempoRandomico = rand.nextInt(2, 6);
            System.out.println("sta per andare in attesa");
            Thread.sleep(tempoRandomico);
            
            barrieraSincronizzata.raggiungeBarriera();
            System.out.println("riprende a lavorare");
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
