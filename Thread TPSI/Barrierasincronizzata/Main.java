

public class Main {
    public static void main(String[] args) {
        BarrieraSincronizzata barrieraSincronizzata = new BarrieraSincronizzata();
        BarrieraThread barrieraThread = new BarrieraThread(barrieraSincronizzata);
        BarrieraThread barrieraThread2 = new BarrieraThread(barrieraSincronizzata);
        BarrieraThread barrieraThread3 = new BarrieraThread(barrieraSincronizzata);
        BarrieraThread barrieraThread4 = new BarrieraThread(barrieraSincronizzata);
        BarrieraThread barrieraThread5 = new BarrieraThread(barrieraSincronizzata);
         BarrieraThread barrieraThread6 = new BarrieraThread(barrieraSincronizzata);
          BarrieraThread barrieraThread7 = new BarrieraThread(barrieraSincronizzata);

        barrieraThread.start();
        barrieraThread2.start();
        barrieraThread3.start();
        barrieraThread4.start();
        barrieraThread5.start();
        barrieraThread6.start();
        barrieraThread7.start();
    }
}
