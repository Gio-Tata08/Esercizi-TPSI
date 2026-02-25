import java.util.ArrayList;

public class Sala{
    private ArrayList<Boolean> posti;
    
    public Sala(int postiTot){
        posti = new ArrayList<Boolean>(postiTot);
        for (int i = 0; i < posti.size(); i++) {
            posti.set(i, false);
        }
    }
    public void prenotaPosto(int numeroPosto)throws PostoGiaOccupatoException{
        if (numeroPosto > posti.size()) {
            throw new PostoNonEsistenteException("Non c'è più posto");
            
        }
        if (posti.get(numeroPosto) == true) {
            throw new PostoGiaOccupatoException("Il posto è già occupato");
        }else{
            posti.set(numeroPosto, true);
        }
    }
}