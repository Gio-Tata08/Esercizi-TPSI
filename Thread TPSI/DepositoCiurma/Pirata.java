public class Pirata extends Thread{
    private Bottino bottino = new Bottino();
    private Stiva stiva;

    public Pirata(Stiva stiva){
        this.stiva = stiva;
    }

    @Override
    public void run(){
        while(true){
            try {
                stiva.deposita(bottino);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}