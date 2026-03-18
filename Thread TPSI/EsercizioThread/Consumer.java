public class Consumer extends Thread{
    private final Buffered buffer;
    public Consumer(Buffered buffer){
        this.buffer = buffer;
    }
    @Override
    public void run(){
        for (int i = 0; i <= 10; i++) {
            try{
                System.out.print("C: " + buffer.getValue());
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
