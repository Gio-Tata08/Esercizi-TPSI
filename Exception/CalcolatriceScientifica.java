public class CalcolatriceScientifica{
    public double divide(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("non puoi dividere per 0");
        }
        return a / b;
    }
    public double sqrt(double x) throws NumeroNegativoException{
        if (x < 0){
            throw new NumeroNegativoException("Non puoi mettere numeri negativi");
        }
        return Math.sqrt(x);
    }
}