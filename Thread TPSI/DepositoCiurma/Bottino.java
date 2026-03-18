import java.util.Random;

public class Bottino{
    private String bottino;
    private Random rand = new Random();
    
    public Bottino(){
        int Nrand = rand.nextInt(1, 3);
        if (Nrand == 1) {
            this.bottino = "monete";
            
        }else if (Nrand == 2) {
            this.bottino = "gioielli";
        }else{
            this.bottino = "spezie";
        }
    }
    public String getBottino(){
        return bottino;
    }
}