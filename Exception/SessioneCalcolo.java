import java.util.ArrayList;

public class SessioneCalcolo{
    private ArrayList<String> storico = new ArrayList<String>();
    private CalcolatriceScientifica cs = new CalcolatriceScientifica();

    public void eseguiDivisione(double a, double b){
        try {
            double risultato = cs.divide(a, b);
            storico.add("Divisione: " + a + " / " + b + " = " + risultato);
        } catch (ArithmeticException e) {
            storico.add("Errore: divisione per zero");
        }
        
    }
    public void computeSqrt(double x){
        try {
            double risultato = cs.sqrt(x);
            storico.add("Radice di: " + x + " = " + risultato);
        } catch (NumeroNegativoException e) {
            storico.add("Errore di calcolo della radice");
        }
    }
    public void stampa(){
        for (int i = 0; i < storico.size(); i++) {
            System.out.println(storico.get(i));
        }
    }
}