import java.util.Random;

public class Cliente extends Thread{
    private String nome;
    private int eta;
    private Buttafuori buttafuori;
    private Random rand = new Random();

    public Cliente(String nome, int eta, Buttafuori buttafuori){
        this.nome = nome;
        this.eta = eta;
        this.buttafuori = buttafuori;
    }
    
    @Override
    public void run(){
        try {
            buttafuori.entra(nome, eta);
            int tempo = rand.nextInt(1000, 5000);
            System.out.println("il Cliente: " + nome + " con l'età di " + eta + " è dentro al locale per: " + tempo);
            Thread.sleep(tempo);
            buttafuori.esci(nome, eta);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
