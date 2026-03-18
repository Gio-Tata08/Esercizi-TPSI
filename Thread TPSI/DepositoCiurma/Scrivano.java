public class Scrivano extends Thread{
    private Bottino bottino;
    public Stiva stiva;

    public Scrivano(Stiva stiva){
        this.stiva = stiva;
    }

    @Override
    public void run(){
        while(true){
            try {
                stiva.preleva();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}