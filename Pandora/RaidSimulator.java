import java.util.ArrayList;
import java.util.Random;


public class RaidSimulator{
    private ArrayList<Avatar> navi = new ArrayList<Avatar>();
    private PostazioneRDA postazione = new PostazioneRDA(new Coordinata(Coordinata.generateRandomLatitudine(), Coordinata.generateRandomLongitudine()), PostazioneRDA.generateRandomDifesa(), PostazioneRDA.generateRandomUbtanium());
    private int postazioniEliminate = 0;

    public RaidSimulator(int Navatar){
        populateNavi(Navatar);
    }
    public void populateNavi(int Navatar){
        for (int i = 0; i < Navatar; i++) {
            Random rand = new Random();
            Avatar avatar = new Avatar("Avatar"+i, "spada", rand.nextInt(1, 20));
            navi.add(avatar);
        }

    }
    public void eseguiRaid(){
        System.out.println("INIZIO ATTACCO");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("INIZIO RAID " + (i+1));
            singoloRaid();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("----------------------");
        }
        System.out.println("Fine Attacco, sono state distrutte " + postazioniEliminate + " postazioni");
    }
    public void singoloRaid(){
        int attacco = 0;
        for (Avatar avatar: navi) {
            try {
                attacco = avatar.attacca(this.postazione);
            } catch (ArmaMalfunzionanteException e) {
                System.out.println(e.getMessage());
            } catch (AttaccoFallitoException e){
                System.out.println(e.getMessage());
            }
            try {
                postazione.difendi(attacco);
                System.out.println("Attacco Riuscito!! " + attacco);
            } catch (DifesaInsufficienteException e) {
                System.out.println(e.getMessage());
                postazioniEliminate ++;
            } catch(UnobtaniumEsauritoException e ){
                System.out.println(e.getMessage());
                postazioniEliminate ++;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            
        }
    }
}