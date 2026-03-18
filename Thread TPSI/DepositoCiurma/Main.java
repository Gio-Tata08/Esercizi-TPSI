


public class Main{
    public static void main(String[] args) {
        Stiva stiva = new Stiva();
        Pirata p1 = new Pirata(stiva);
        Pirata p2 = new Pirata(stiva);
        Pirata p3 = new Pirata(stiva);
        Pirata p4 = new Pirata(stiva);
        Pirata p5 = new Pirata(stiva);
        Pirata p6 = new Pirata(stiva);
        Scrivano s1 = new Scrivano(stiva);
        Scrivano s2 = new Scrivano(stiva);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        s1.start();
        s2.start();
    }
}