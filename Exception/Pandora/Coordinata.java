import java.util.Random;

public class Coordinata{
    private double latitudine;
    private double longitudine;

    public Coordinata(double latitudine, double longitudine){
        if (latitudine > 90 || latitudine < -90) {
            throw new IllegalArgumentException();
        }
        if (longitudine > 180 || latitudine < -180) {
            throw new IllegalArgumentException();
        }
    }
    public double getLatitudine(){
        return latitudine;
    }
    public double getLongitudine(){
        return longitudine;
    }
    public static double generateRandomLatitudine(){
        Random rand = new Random();
        double randLatitudine = rand.nextDouble(-90 , 90);
        return randLatitudine;
    } 
    public static double generateRandomLongitudine(){
        Random rand = new Random();
        double randLongitudine = rand.nextDouble(-180 , 180);
        return randLongitudine;
    } 
}