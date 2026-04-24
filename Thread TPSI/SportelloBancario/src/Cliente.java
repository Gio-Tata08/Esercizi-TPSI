import java.util.Random;

public class Cliente extends Thread{
    private int nome;
    private Sportello sportello;
    Random rand = new Random();

    public Cliente(int nome, Sportello sportello){
        this.nome = nome;
        this.sportello = sportello;
    }
    @Override
    public void run(){
        System.out.println("Cliente " + nome + " tenta l'accesso.");
        if (sportello.accesso()) {
            System.out.println("Cliente " + nome + " è servito.");
            // Tempo di servizio tra 2 e 4 secondi
            try {
                Thread.sleep(2000 + rand.nextInt(2001));

            sportello.liberaCassiere();
            System.out.println("Cliente " + nome + " ha finito e libera il cassiere.");
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        } else {
            System.out.println("Cliente " + nome+ " rinuncia e se ne va.");
        }
    }
}


