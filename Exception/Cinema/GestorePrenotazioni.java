import java.util.ArrayList;
public class GestorePrenotazioni{
    private ArrayList<Prenotazione> prenotazioni = new ArrayList<>();

    public void creaPrenotazione(Sala sala, int numeroPosto, String telefono) {
        try {
            Prenotazione p = new Prenotazione();
            sala.prenotaPosto(numeroPosto);
            prenotazioni.add(p);
            System.out.println("Prenotazione confermata: " + p);

        } catch (PostoNonEsistenteException e) {
            System.out.println("ERRORE GRAVE: posto inesistente");
        } catch (PostoGiaOccupatoException e) {
            System.out.println("Posto occupato, scegli un altro");
        } catch (TelefonoNonValidoException e) {
            System.out.println("Telefono non valido, riprova");
        }
    }

    public ArrayList<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }
}