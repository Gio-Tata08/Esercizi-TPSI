import java.util.Random;

public class Corridore extends Thread{
    private String name;
    private Random rand = new Random();

    public Corridore(String name){
        this.name = name;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("il Corridore: " + this.name + " si trova a: " + (i+1 * 10));
            int numeroRandom = rand.nextInt(100, 1000);
            try {
                Thread.sleep(numeroRandom);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
         
        }
        System.out.println("Il corridore: "+ this.name + " ha terminato la corsa");

    }

}