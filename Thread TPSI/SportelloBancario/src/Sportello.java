public class Sportello {
    private boolean servito = false;
    private int cassieri;
    public Sportello(int cassieri){

        this.cassieri = cassieri;
    }
    public synchronized boolean accesso(){
        while (cassieri == 0){
            try {
                wait(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        cassieri--;
        return true;
    }
    public synchronized boolean liberaCassiere(){
        cassieri++;
        notifyAll();
        return false;
    }
}
