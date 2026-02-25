
import java.util.Random;

public class CircuitoBancario{


    public void autorizzaPagamento(CartaDiCredito carta, double importo)throws ConnessioneBancariaException{
        Random rand = new Random();
        int random = rand.nextInt(1,100);
        if (random < 10) {
            throw new ConnessioneBancariaException("Exception: Connessione Assente");
        }else if (random >= 10 && random < 15) {
            throw new FrodeRilevatException("Exception: Frode rilevata");
        }else{
            carta.scalaSoldi(importo);
        }
    }
}