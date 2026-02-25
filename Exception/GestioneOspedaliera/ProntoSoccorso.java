import java.util.ArrayList;
import java.util.Random;

public class ProntoSoccorso{
    private ArrayList<Paziente> pazienti = new ArrayList<>();
    private ArrayList<Medico> medici = new ArrayList<>();
    private MacchinarioDiagnostico macchinarioDiagnostico = new MacchinarioDiagnostico();
    private ArrayList<SalaOperatoria> saleoperatorie = new ArrayList<>();

    
    public void aggiungiPaziente(Paziente paziente){
        pazienti.add(paziente);
    }
    public void aggiungiMedico(Medico medico){
        medici.add(medico);
    }
    public void aggiungiSalaOperatoria(SalaOperatoria salaOperatoria){
        saleoperatorie.add(salaOperatoria);
    }
    public void assegnazione() throws InterruptedException, MedicoNonSiLiberaException{
        Random rand = new Random();
       for (int i = 0; i < pazienti.size(); i++) {
           try {
                Paziente pazienteCorrente = pazienti.get(i);
                System.out.println("Turno Paziente " + i );
                Medico medico = getMedicoLibero();
                System.out.println("Paziente: " + i + " assegnato al medico " + medico.getNome());
                macchinarioDiagnostico.esegui();
                if (pazienteCorrente.getCodiceGravita().equals("rosso") || pazienteCorrente.getCodiceGravita().equals("giallo")) {
                    SalaOperatoria salaOperatoria = getSalaOperatoria();
                    System.out.println("Paziente " + i + " nella sala Operatoria: " + salaOperatoria.getNumero());
                }
           } catch (MedicoNonDisponibileException ex) {
               System.out.println(ex.getMessage());
               System.out.println("Attesa che un medico si liberi");
               Thread.sleep(rand.nextInt(1000, 5000));
               liberaMedico();
           } catch (SalaOperatoriaNonDisponibileException e){
                System.out.println(e.getMessage());
           }catch(MacchinarioFallitoException e){
                System.out.println(e.getMessage());
           }

       }
       System.out.println("I pazienti sono terminati");
    }
    public Medico getMedicoLibero()throws MedicoNonDisponibileException{
        for (Medico medico : medici) {
            if (!medico.getOccupato()) {
                medico.setOccupato(true);
                return medico;
            }
        }
        throw new MedicoNonDisponibileException("Medico non disponibile");
    }
    public SalaOperatoria getSalaOperatoria()throws SalaOperatoriaNonDisponibileException{
        for (SalaOperatoria salaOperatoria : saleoperatorie) {
            if (!salaOperatoria.getOccupata()) {
                salaOperatoria.setOccupata(true);
                return salaOperatoria;
            }
        }
        throw new SalaOperatoriaNonDisponibileException("Sala Operatoria non disponibile");
    }
    public void liberaMedico()throws MedicoNonSiLiberaException{
        Random rand = new Random();
        int random = rand.nextInt(0,medici.size());
        medici.get(random).setOccupato(false);
        System.out.println("il medico: "+ medici.get(random).getNome() + " si è liberato");
        int probabilita = rand.nextInt(1,101);
        if (probabilita <= 10) {
            throw new MedicoNonSiLiberaException("Il medico non si è liberato");
        } 
    }
    
}