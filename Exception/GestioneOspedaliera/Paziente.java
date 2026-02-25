public class Paziente{
    private String nome;
    private String codiceGravità;
    private boolean diagnosiGravita;

    public Paziente(String nome, String codiceGravita, boolean diagnosiGravita){
        this.nome = nome;
        this.codiceGravità = codiceGravita;
        this.diagnosiGravita = diagnosiGravita;
    }
    public String getNome(){
        return nome;
    }
    public String getCodiceGravita(){
        return codiceGravità;
    }
    public boolean getDiagnosiGravita(){
        return diagnosiGravita;
    }
}