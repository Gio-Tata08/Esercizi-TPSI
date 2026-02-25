public class Medico{
    private String nome;
    private boolean occupato = false;

    public Medico(String nome){
        this.nome = nome;
        
    }

    public String getNome(){
        return nome;
    }
    public boolean getOccupato(){
        return occupato;
    }
    public void setOccupato(boolean occupato){
        this.occupato = occupato;
    }
   
}