public class Buttafuori {
    private final int capacitaMassima = 5;
    private int personeAttuali = 0;

    public synchronized void entra(String nome, int eta){
        if (eta < 18){
            throw new RuntimeException("Non puoi entrare all'interno del locale");
        }
        while (capacitaMassima <= personeAttuali) { 
            try {
                wait();
                System.out.println("Cliente: " + nome + " con l'età di: " + eta + " è in attesa");
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        personeAttuali++;
        System.out.println("Entrato: " + nome + " con l'età di: " + eta);
    }
    public synchronized void esci(String nome, int eta){
        personeAttuali--;
        notifyAll();
        System.out.println("La persona: " + nome + " con l'età di: " + eta + " è uscita");
        System.out.println("una persona può entrare");
    }
}
