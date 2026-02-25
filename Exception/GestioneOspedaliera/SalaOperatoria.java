public class SalaOperatoria{
    private int numero;
    private boolean occupata;

    public SalaOperatoria(int numero, boolean occupata){
        this.numero = numero;
        this.occupata = occupata;
    }
    public int getNumero(){
        return numero;
    }
    public boolean getOccupata(){
        return occupata;
    }
    public void setOccupata(boolean occupata){
        this.occupata = occupata;
    }
}