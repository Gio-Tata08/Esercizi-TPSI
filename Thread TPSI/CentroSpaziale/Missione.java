
import java.util.Random;

public class Missione extends Thread {
    private int codiceNumerico;
    private CentroLancio centroLancio;
    private Random rand = new Random();

    public Missione(int codiceNumerico, CentroLancio centroLancio){
        this.codiceNumerico = codiceNumerico;
        this.centroLancio = centroLancio;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(rand.nextInt(1000,3000));
            centroLancio.acquisisciRisorse();
            Thread.sleep(rand.nextInt(2000, 5000));
            centroLancio.rilasciaRisorse();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
