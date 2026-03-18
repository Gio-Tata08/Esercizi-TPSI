public class Buffered {
    //valore attuale
    private int value;
    //quanti ne ho in questo momento
    private int numItemsInside = 0;
    //Il Max
    private final int Maxsize = 1;
    //chiamato dal producer
    public synchronized void setValue(int Newvalue) throws InterruptedException{

        //se buffer pieno, aspetta!
        if(numItemsInside == Maxsize) wait();

        numItemsInside++;
        notify(); //wake up to reality
        this.value = Newvalue;
    }

    public synchronized int getValue() throws InterruptedException{
        if (numItemsInside == 0) wait();
        numItemsInside--;
        return this.value;
    }
}
