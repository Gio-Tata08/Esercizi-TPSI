public class Main{
    public static void main(String[] args) {
        Paziente paziente1 = new Paziente("Gianmarco", "giallo", true);
        Paziente paziente2 = new Paziente("Sebastiano", "verde", true);
        Paziente paziente3 = new Paziente("Ilaria", "bianco", true);
        Paziente paziente4 = new Paziente ("Andrea", "rosso", true);
        Paziente paziente5 = new Paziente("Emanuele", "giallo", true);
        Medico medico1 = new Medico("Nicolò");
        Medico medico2 = new Medico("Vittoria");
        SalaOperatoria salaOperatoria1 = new SalaOperatoria(6, false);
        SalaOperatoria salaOperatoria2 = new SalaOperatoria(7, false);
        ProntoSoccorso prontoSoccorso = new ProntoSoccorso();
        prontoSoccorso.aggiungiPaziente(paziente1);
        prontoSoccorso.aggiungiPaziente(paziente2);
        prontoSoccorso.aggiungiPaziente(paziente3);
        prontoSoccorso.aggiungiPaziente(paziente4);
        prontoSoccorso.aggiungiPaziente(paziente5);
        prontoSoccorso.aggiungiMedico(medico1);
        prontoSoccorso.aggiungiMedico(medico2);
        prontoSoccorso.aggiungiSalaOperatoria(salaOperatoria1);
        prontoSoccorso.aggiungiSalaOperatoria(salaOperatoria2);
        try {
            prontoSoccorso.assegnazione();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        } catch (MedicoNonSiLiberaException ex) {
            System.out.println(ex.getMessage());
        }

    }
}