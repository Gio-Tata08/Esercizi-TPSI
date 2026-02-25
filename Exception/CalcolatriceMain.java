public class CalcolatriceMain{
    public static void main(String[] args) {
        SessioneCalcolo sc = new SessioneCalcolo();
        sc.eseguiDivisione(4, 2);
        sc.computeSqrt(25);
        sc.eseguiDivisione(3, 0);
        sc.computeSqrt(-10);
        sc.stampa();
        
    }
}