import java.util.Random;

public class MacchinarioDiagnostico{
    public void esegui(){
        Random rand = new Random();
        int probabilita = rand.nextInt(1,101);
        if (probabilita <= 20) {
            throw new MacchinarioFallitoException("Il macchinario è fallito");
        }
    }
}