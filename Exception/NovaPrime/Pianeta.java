
import java.util.ArrayList;
import java.util.Random;

public class Pianeta{
    private int salute;
    private ArrayList<CellaScudo> scudo = new ArrayList<>();
    private Random rand = new Random();

    public Pianeta(int salute){
        this.salute = salute;
    }
    public void subisciDanno(int danno){
        this.salute -= danno;
    }
    public void fornisciEnergia()throws EnergiaInsufficienteException {
        int fornituraEnergia = rand.nextInt(1,101);
        if (fornituraEnergia <= 40) {
            int NCelleRicaricate = rand.nextInt(0, scudo.size());
        for (int i = 0; i < NCelleRicaricate; i++) {
                int cellaDaCaricare = rand.nextInt(0, scudo.size());
                CellaScudo cella = scudo.get(NCelleRicaricate);
                cella.setVita(cella.getVita()+ rand.nextInt(1, 30));
            }
        }else{
            throw new EnergiaInsufficienteException("Energia insufficente");
        }
    }
    public int statoScudo()throws ScudoInefficaceException{
        int celleAttive = 0;
        for (int i = 0; i < scudo.size(); i++) {
            if (scudo.get(i).getStato().equals("attivo")) {
                celleAttive += 1;
            }
        }
        if (celleAttive == 0) {
            throw new ScudoInefficaceException("Non ci sono più celle attive");
        }
        return celleAttive;
    }
    public void aggiungiCella(CellaScudo cellaScudo){
        scudo.add(cellaScudo);
    }
    public CellaScudo cellaCasuale(){
        return scudo.get(rand.nextInt(0, scudo.size()));
    }
    public int getVita(){
        return salute;
    }
}