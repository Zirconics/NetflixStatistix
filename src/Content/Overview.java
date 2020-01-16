package Content;

public class Overview {
    private int FilmId;
    private String Title;
    private Double Duration;
    private Genre Genre;
    private Language Language;
    private int AgeIndication;

    public Overview(int Filmid, String Title, Genre Genre, Language Language, double Duration, int AgeIndication){
        this.FilmId = Filmid;
        this.Title = Title;
        this.Duration = Duration;
        this.Genre = Genre;
        this.Language = Language;
        this.AgeIndication = AgeIndication;
    }

    public int getFilmId() {
        return FilmId;
    }

    public String getTitle() {
        return Title;
    }

    public Double getDuration() {
        return Duration;
    }

    public Content.Genre getGenre() {
        return Genre;
    }

    public Content.Language getLanguage() {
        return Language;
    }

    public int getAgeIndication() {
        return AgeIndication;
    }
}
