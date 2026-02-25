public class NaveAliena{
    private int vita;
    private int danno;

    public NaveAliena(int vita, int danno){
        this.vita = vita;
        this.danno = danno;
    }
    public int attacca(CellaScudo cellaScudo){
        cellaScudo.riceviDanno(danno);
        if (cellaScudo.getVita() > danno) {
            return 0;
        }else{
            return danno - cellaScudo.getVita();
        }
    }
    public void subisciDanno(int danno)throws NaveDistruttaException{
        this.vita -= danno;
        if (this.vita <= 0) {
            throw new NaveDistruttaException("La nave è stata distrutta");
        }
    }
    public int getDanno(){
        return danno;
    }
    public int getVita(){
        return vita;
    }
}