import java.util.Random;

public class Auto extends Thread{
    private String nome;
    private Random rand;
    private Parcheggio parcheggio;

    public Auto(String nome, Parcheggio parcheggio){
        this.nome = nome;
        this.rand = new Random();
        this.parcheggio = parcheggio;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public void run(){
        try {
            //1. guida per un pò [2,5] sec.
            int tempoGuida = 2000 + rand.nextInt(3000);
            System.out.println(getNome() + " sta guidando per " + tempoGuida /1000 + " sec.");
            sleep(tempoGuida);
            //2. cerca di entrare
            parcheggio.enter(this);
            int tempoParcheggio = 3000 + rand.nextInt(5001);
            sleep(tempoParcheggio);
            System.out.println(getNome() + " parcheggiata per " + tempoParcheggio / 1000+ "sec.");
            parcheggio.exit(this);
        } catch (InterruptedException e) {
            interrupt();
        }
    }
}
