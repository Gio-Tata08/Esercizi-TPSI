import java.util.Random;

public class Avatar{
    private String nome;
    private String arma;
    private int forzaAttacco;

    public Avatar(String nome, String arma, int forzaAttacco){
        this.nome = nome;
        this.arma = arma;
        this.forzaAttacco = forzaAttacco;
    }

    public int attacca(PostazioneRDA postazione)throws ArmaMalfunzionanteException, AttaccoFallitoException{
        if (!probabilitaAttacco(60)) {
            throw new AttaccoFallitoException("l'attacco non è stato effettuato");
        }
        if (!probabilitaAttacco(60)) {
            throw new ArmaMalfunzionanteException("L'attacco è fallito");
        }
        return forzaAttacco;
    }
    public boolean probabilitaAttacco(int probabilita){
        Random rand = new Random();
        int numeroRandomico = rand.nextInt(1, 100);
        return numeroRandomico <= probabilita;
    }

}