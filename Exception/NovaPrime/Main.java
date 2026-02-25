
import java.util.ArrayList;
import java.util.Random;
public class Main{
    public static void main(String[] args) {
        Random rand = new Random();
        // creazione pianeta e scudo
        Pianeta pianeta = new Pianeta(rand.nextInt(1,100));
        int Ncelle = rand.nextInt(1,11);
        for (int i = 0; i < Ncelle; i++) {
            int Nvita = rand.nextInt(1,50);
            CellaScudo cellaScudo = new CellaScudo(Nvita);
            pianeta.aggiungiCella(cellaScudo);
        }
        // creazione nave aliena
        ArrayList<NaveAliena> flotta = new ArrayList<>();
        for (int i = 0; i < rand.nextInt(1,10); i++) {
            NaveAliena naveAliena = new NaveAliena(rand.nextInt(1,100), rand.nextInt(1,100));
            flotta.add(naveAliena);
        }
        int i = 1;
        while (pianeta.getVita() > 0 && navicelleInVita(flotta)) { 
            System.out.println("Inizia il turno di Battaglia " + i);
            turnoDiBattaglia(flotta, pianeta);
                try {
                    pianeta.fornisciEnergia();
                } catch (EnergiaInsufficienteException ex) {
                    System.out.println(ex.getMessage());
                }
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        if (pianeta.getVita() > 0) {
            System.out.println("Il pianeta ha Vinto!!");
        }else{
            System.out.println("Le navicelle hanno Vinto!");
        }

    }
    public static void turnoDiBattaglia(ArrayList<NaveAliena> flotta, Pianeta pianeta){
        Random rand = new Random();
        for (NaveAliena naveAliena : flotta) {
            CellaScudo cellascudo = pianeta.cellaCasuale();
            naveAliena.attacca(cellascudo);
            if (cellascudo.getStato().equals("attivo")) {
                try {
                    naveAliena.subisciDanno(cellascudo.contrattacca());
                } catch (NaveDistruttaException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if (naveAliena.getDanno() > cellascudo.getVita() ) {
                pianeta.subisciDanno(naveAliena.getDanno() - cellascudo.getVita());
            }
            try {
                pianeta.statoScudo();
            } catch (ScudoInefficaceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static boolean navicelleInVita(ArrayList<NaveAliena> flotta){
        for (NaveAliena naveAliena : flotta) {
            if (naveAliena.getVita() > 0) {
                return true;
            }
        }
        return false;
    }
}