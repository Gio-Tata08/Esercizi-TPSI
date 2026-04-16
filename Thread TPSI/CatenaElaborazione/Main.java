
// RISORSA CONDIVISA (Canale tra due stadi)  
class Canale {
    private Integer valore = null;
    public synchronized void scrivi(int v) throws InterruptedException {
        while(valore != null) wait();
        valore = v; notifyAll();
    }
    public synchronized int leggi() throws InterruptedException {
        while(valore == null) wait();
        int v = valore; valore = null; notifyAll();
        return v;
    }
}

// Thread
class Stadio extends Thread {
    private Canale in, out;
    private int id, k;
    public Stadio(int id, Canale in, Canale out, int k) { this.id=id; this.in=in; this.out=out; this.k=k; }

    public void run() {
        try {
            for(int i=0; i<k; i++) {
                int dato = (in == null) ? (int)(Math.random()*100) : in.leggi();
                int proc = dato + id; // Trasformazione [cite: 152]
                System.out.println("Stadio " + id + " elabora " + dato + " -> " + proc);
                if(out != null) out.scrivi(proc);
                else System.out.println("[Risultato #" + i + "]: " + proc);
            }
        } catch (InterruptedException e) {}
    }
}

public class Main {
    public static void main(String[] args) {
        int K = 10;
        Canale c1 = new Canale(), c2 = new Canale(), c3 = new Canale();
        new Stadio(0, null, c1, K).start();
        new Stadio(1, c1, c2, K).start();
        new Stadio(2, c2, c3, K).start();
        new Stadio(3, c3, null, K).start();
    }
}

