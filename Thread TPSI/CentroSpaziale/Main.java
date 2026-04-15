import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CentroLancio centroLancio = new CentroLancio(3, 2);
        ArrayList<Missione> missioni = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            missioni.add(new Missione(i, centroLancio));
        }
        for (Missione missione : missioni) {
            missione.start();
        }
         for (Missione missione : missioni) {
            try {
                missione.join();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
