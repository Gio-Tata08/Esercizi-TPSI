

public class Main{
    public static void main(String[] args) {
        Stazione stazione = new Stazione("TRENORD", 5);
        Treno treno1 = new Treno(stazione, 1);
        Treno treno2 = new Treno(stazione, 2);
        Treno treno3 = new Treno(stazione, 3);
        Treno treno4 = new Treno(stazione, 4);
        Treno treno5 = new Treno(stazione, 5);

        treno1.start();
        treno2.start();
        treno4.start();
        treno3.start();
        treno5.start();
    }
}