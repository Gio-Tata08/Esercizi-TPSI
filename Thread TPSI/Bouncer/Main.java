public class Main {
    public static void main(String[] args) {
        Buttafuori b = new Buttafuori();
    
    Cliente c1 = new Cliente("Giacomo", 17, b);
    c1.start();


    Cliente c2 = new Cliente("Marco", 25, b);
    c2.start();

    Cliente c3 = new Cliente("Anna", 30, b);
    c3.start();

    Cliente c4 = new Cliente("Luca", 22, b);
    c4.start();

    Cliente c5 = new Cliente("Elena", 28, b);
    c5.start();

    Cliente c6 = new Cliente("Sofia", 19, b);
    c6.start();

    Cliente c7 = new Cliente("Davide", 35, b);
    c7.start();

    Cliente c8 = new Cliente("Sara", 24, b);
    c8.start();

    Cliente c9 = new Cliente("Matteo", 27, b);
    c9.start();

    Cliente c10 = new Cliente("Chiara", 31, b);
    c10.start();
    }
        
}
