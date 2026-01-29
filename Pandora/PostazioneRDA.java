import java.util.Random;

public class PostazioneRDA{
    private Coordinata postazione;
    private int difesa;
    private int ubtanium;

    public PostazioneRDA(Coordinata postazione, int difesa, int ubtanium){
        if (difesa < 0) {
            throw new IllegalArgumentException();
        }
        if (ubtanium < 0) {
            throw new IllegalArgumentException();
        }
        this.postazione = postazione;
        this.difesa = difesa;
        this.ubtanium = ubtanium;
    }
    public PostazioneRDA(double latitudine, double longitudine, int difesa, int ubtanium){
        if (difesa < 0) {
            throw new IllegalArgumentException();
        }
        if (ubtanium < 0) {
            throw new IllegalArgumentException();
        }
        this.postazione = new Coordinata(latitudine, longitudine);
        this.difesa = difesa;
        this.ubtanium = ubtanium;
    }

    public void difendi(int attacco){
        if (difesa <= attacco)  {
            throw new DifesaInsufficienteException("la difesa non supporta l'attacco");
        }
        this.difesa = difesa - attacco;
        if (ubtanium == 0) {
            throw new UnobtaniumEsauritoException("le miniere sono esaurite");
        }
        this.ubtanium = ubtanium -1;
    }
    public static int generateRandomDifesa(){
        Random rand = new Random();
        int randDifesa = rand.nextInt(1, 100);
        return randDifesa;
    } 
    public static int generateRandomUbtanium(){
        Random rand = new Random();
        int randUbtanium = rand.nextInt(1, 11);
        return randUbtanium;
    } 
}