import java.util.ArrayList;
import java.util.Random;

public class RaidSimulator{
    private ArrayList<Avatar> navi = new ArrayList<Avatar>();
    private PostazioneRDA postazione;

    public void populateNavi(int Navatar){
        for (int i = 0; i < Navatar; i++) {
            Random rand = new Random();
            Avatar avatar = new Avatar("AvatarI", "spada", rand.nextInt(1, 20));
            navi.add(avatar);
        }
    }
}