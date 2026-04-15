import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

      //1. tempo max di simulazione. il parcheggio chiude dopo F secondi
        // 2. non tutte i veicoli sono uguali. alcuni occupano 1 posto, altri 2, altre 3

        Parcheggio parcheggio = new Parcheggio(5);
        final int MassimoAuto = 10;
        List<Auto> macchine = new ArrayList<>();
        for (int i = 0; i < MassimoAuto; i++) {
            macchine.add(new Auto("auto-" + (i+1), parcheggio));
        }
        for(Auto a : macchine) a.start();
        for(Auto a: macchine) a.join();
        System.out.println("FINE");
    }
}
