public class T extends Thread {
private long result = 0;
public void run() {
    try {
        while (!Thread.currentThread().isInterrupted()) {
            // Operazione che "dorme"
            Thread.sleep(1000); 
            
            System.out.println("Lavoro in corso...");
        }
    } catch (InterruptedException e) {
        // Il thread è stato interrotto MENTRE dormiva
        System.out.println("Interrotto durante lo sleep!");
    }
    
    System.out.println("Fine pulita del thread.");
}

}