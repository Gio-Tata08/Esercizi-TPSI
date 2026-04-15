public class Parcheggio {
    private int postiDisponibili;
    
    public Parcheggio(int postiInziali){
        
        this.postiDisponibili = postiInziali;

    }
    public synchronized void enter(Auto auto)throws InterruptedException {
        while(postiDisponibili==0){
            System.out.println(auto.getNome() + " in attessa (parcheggio pieno)");
        wait();
        }
        postiDisponibili--;
        System.out.println(auto.getNome() + " entrata. Posti disponibili: " + postiDisponibili);

    }
    public synchronized void exit(Auto auto){
        postiDisponibili++;
        System.out.println(auto.getNome() + " uscita. Posti disponibili: " + postiDisponibili);
        notifyAll();
    }

}
