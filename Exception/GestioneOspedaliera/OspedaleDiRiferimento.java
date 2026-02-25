import java.util.Random;

public class OspedaleDiRiferimento{
    public void trasferimento(){
        Random rand = new Random();
        int probabilita = rand.nextInt(1,101);
        if (probabilita <= 20) {
            throw new TrasferimentoRifutatoException("Il trasferimento è stato rifiutato");
        }
    }
}