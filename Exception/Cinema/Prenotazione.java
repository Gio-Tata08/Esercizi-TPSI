public class Prenotazione{
    private int numeroPosto;
    private String telefono; 

    public Prenotazione()throws TelefonoNonValidoException{
        if (telefono.length() != 10) {
            throw new TelefonoNonValidoException("Deve avere 10 cifre");
        }
    }
}