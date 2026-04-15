public class Stazione {
    private String nome;
    private boolean[] binari;

    public Stazione(String nome, int nBinari){
        this.nome = nome;
        this.binari = new boolean[nBinari];
    }
    public synchronized int  occupaBinario(){
        int binario = binarioLibero();
        while (binario == -1) {
           try {
               wait();

           } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
           }
       }
       binari[binario] = true;
       return binario;
    }
    public int  binarioLibero(){
        for (int i = 0; i < binari.length; i++) {
            if(binari[i] == false){
                return i;
            }
        }
        return -1;
    }
    public synchronized void liberaBinario(int binario){
        binari[binario] = false;
        notifyAll();
    }
}
