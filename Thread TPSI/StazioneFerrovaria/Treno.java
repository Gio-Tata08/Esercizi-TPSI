import java.util.Random;

public class Treno extends Thread {
    private Stazione stazione;
    private int codice;
    private Random rand = new Random();

    public Treno(Stazione stazione, int codice){
        this.stazione = stazione;
        this.codice = codice;
    }
    @Override
    public void run(){
        try {
            int viaggio = rand.nextInt(2000, 5000);
            Thread.sleep(viaggio);
            System.out.println("Il treno con il codice: " + codice + " è in viaggio per: " + viaggio + " sec");
            int binarioOccupato = stazione.occupaBinario();
            int sosta = rand.nextInt(2000, 5000);
            Thread.sleep(sosta);
            System.out.println("Il treno con il codice: " + codice + " è in sosta per: " + sosta + " sec");
            stazione.liberaBinario(binarioOccupato);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
