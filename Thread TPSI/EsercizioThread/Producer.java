import java.nio.Buffer;

public class Producer extends Thread{
    private Buffered buffer;

    public Producer(Buffered buffer){
        this.buffer = buffer;
    }
    @Override
    public void run(){
        //per 10 volte, fai +1 nel buffer
        for (int i = 0; i <= 10; i++) {
            try{
                buffer.setValue(i);
                System.out.print("P: " + i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
