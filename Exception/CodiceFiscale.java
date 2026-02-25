public class CodiceFiscale{
    private String cf;

    public CodiceFiscale(String cf) throws CodiceFiscaleNonValidoException{
        if (cf.length() != 16) {
            throw new CodiceFiscaleNonValidoException("il codice fiscale " + cf + " ha una lunghezza diversa da 16.");
        }
        for (int i = 0; i < cf.length(); i++) {
            char lettera = cf.charAt(i);
            if (!Character.isLetterOrDigit(lettera)) {
                throw new CodiceFiscaleNonValidoException("non vanno bene i caratteri speciali");
            }
            if (Character.isLowerCase(lettera)){
                throw new CodiceFiscaleNonValidoException("non vanno bene i caratteri minuscoli");
            }
        }
        
        this.cf = cf;
    }
    
    public String getCf(){
        return cf;
    }
}