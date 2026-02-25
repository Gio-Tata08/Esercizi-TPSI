
import java.util.Calendar;
import java.util.Date;

public class CartaDiCredito{
    private String numero;
    private int scadenzaMese;
    private int scadenzaAnno;
    private String cvv;
    private double saldo;

    public CartaDiCredito(String numero, int scadenzaMese, int scadenzaAnno, String cvv, double saldo){
        this.numero = numero;
        this.scadenzaMese = scadenzaMese;
        this.scadenzaAnno = scadenzaAnno;
        this.cvv = cvv;
        this.saldo = saldo;

    }

    public boolean isScaduta(){
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH) +1;
        int year = calendar.get(Calendar.YEAR);
        System.out.println(month + " " + year);
        if (scadenzaAnno > year) {
            return true;
        }else if (scadenzaAnno == year) {
            if (month <= scadenzaMese) {
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public boolean hasSaldo(double importo){
        if (saldo >= importo) {
            return true;
        }
        return false;
    }
    public void scalaSoldi(double importo){
        if (this.hasSaldo(importo)) {
            this.saldo -= importo;
        }
    }


}