public class BarrieraSincronizzata{
   private int contaAttesa = 0;
   private final int MAX_ATTESA = 5;

   public synchronized void raggiungeBarriera(){
        if(MAX_ATTESA > contaAttesa){
            try {
                contaAttesa++;
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            notifyAll();
            System.out.println("Thread svegliati");
        }
   }
}
