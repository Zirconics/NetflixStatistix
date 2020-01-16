package Content;

import java.util.HashMap;

public class Serie extends Overview {
    private HashMap<String, Episode > episodes;

    public Serie (int Filmid, String Title, Genre Genre, Language Language, double Duration, int AgeIndication,HashMap<String, Episode> episodes){
        super(Filmid,Title,Genre,Language,Duration,AgeIndication);
        this.episodes = episodes;
    }
}
