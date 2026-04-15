public class Main{
    public static void main(String[] args) {
       Logger log = new Logger();
log.start();
for (int i=0;i<5;i++)
log.aggiungi("msg-"+i);
System.out.println("main finito");
    }
}