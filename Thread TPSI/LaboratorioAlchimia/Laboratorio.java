public class Laboratorio {
    private int fornaci;
    private int tavoli;
    private int coppe;

    public Laboratorio(int fornaci, int tavoli, int coppe){
        this.fornaci = fornaci;
        this.tavoli = tavoli;
        this.coppe = coppe;
    }
    public synchronized void acquisisciStrumenti(){
        while(fornaci == 0 || tavoli == 0 || coppe == 0){
            try {
                System.out.println("le fornaci o i tavoli o le coppe non sono disponibili");
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("le fornaci, tavoli e coppe possono essere acquisite");
        fornaci--;
        tavoli--;
        coppe--;
    }
    public synchronized void rilasciaStrumenti(){
        fornaci++;
        tavoli++;
        coppe++;
        System.out.println("rilascio degli strumenti");
        notifyAll();
    }
}
