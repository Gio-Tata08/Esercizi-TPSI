import java.util.ArrayList;
import java.util.List;

public class Logger {
    public class Logger extends Thread {
private List<String> messaggi
= new ArrayList<>();
public Logger() { setDaemon(true); }
public void aggiungi(String msg) {
messaggi.add(msg);
}
public void run() {
for (String m : messaggi) {
scriviSuFile(m);
}
}
}
}
