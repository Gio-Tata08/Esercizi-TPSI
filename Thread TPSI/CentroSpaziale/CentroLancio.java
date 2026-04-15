public class CentroLancio {
    
    private int rampe;
    private int torri;

    public CentroLancio(int rampe, int torri){
        this.rampe = rampe;
        this.torri = torri;
    }

    public synchronized void acquisisciRisorse(){
        while (rampe == 0 || torri == 0) { 
            try {
                System.out.println("torri o rampe non disponibili");
                wait();
            } catch (InterruptedException ex) {
               System.out.println(ex.getMessage());
            }
        }
        rampe--;
        torri--;
        System.out.println("missione partita");
    }
    public synchronized void rilasciaRisorse(){
        rampe++;
        torri++;
        System.out.println("risorsa rilasciata");
        notifyAll();
    }
    
}
