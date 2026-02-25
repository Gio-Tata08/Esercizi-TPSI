public class Anagrafe{
    public void aggiungiCittadino(String codiceFiscale){
        try {
            CodiceFiscale cf = new CodiceFiscale(codiceFiscale);
            System.out.println("codice fiscale corretto!!");
        } catch (CodiceFiscaleNonValidoException e) {
            System.out.println(e.getMessage());
        }
    }
}