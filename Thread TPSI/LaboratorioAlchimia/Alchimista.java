import java.util.Random;

public class Alchimista extends Thread{
    private String nome;
    private Laboratorio laboratorio;
    private Random rand = new Random();

    public Alchimista(String nome, Laboratorio laboratorio){
        this.nome = nome;
        this.laboratorio = laboratorio;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(rand.nextInt(1000, 3000));
            laboratorio.acquisisciStrumenti();
            Thread.sleep(rand.nextInt(3000, 6000));
            laboratorio.rilasciaStrumenti();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
