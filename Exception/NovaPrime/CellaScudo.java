
import java.util.Random;

public class CellaScudo{
    private int vita;
    private String stato = "attivo";
    private Random rand = new Random();

    public CellaScudo(int vita){
        this.vita = vita;
    }
    public int getVita(){
        return vita;
    }
    public String getStato(){
        return stato;
    }
    public void setVita(int vita){
        this.vita = vita;
    }
    public void setStato(String stato){
        this.stato = stato;
    }
    public void riceviDanno(int danno){
        if (vita <= danno) {
            stato = "disattivo";
            vita = 0;
        }else{
            this.vita -= danno;
        }
    }
    public void rigenera(int vitaAggiunta){
        stato = "attivo";
        this.vita += vitaAggiunta;
    }
    public int contrattacca(){
        int dannoCasuale = rand.nextInt(1, 50);
        int probabilitAttacco = rand.nextInt(0, 101);
        if (probabilitAttacco <= 30){
            return dannoCasuale;
        }
        return 0;
    }
}