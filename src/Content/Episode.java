package Content;

public class Episode {
    private int SerieId;
    private String EpisodeId;
    private String Title;
    private double Duration;
    private int AveragePercentage;
    private int SerialNumber;

    public Episode (int SeriesId, String EpisodeId, String Title, int Duration, int AveragePercentage, int SerialNumber){
        this.SerieId = SeriesId;
        this.EpisodeId = EpisodeId;
        this.Title = Title;
        this.Duration = Duration;
        this.AveragePercentage = AveragePercentage;
        this.SerialNumber = SerialNumber;
    }

    public int getSerieId() {
        return SerieId;
    }

    public String getEpisodeId() {
        return EpisodeId;
    }

    public String getTitle() {
        return Title;
    }

    public double getDuration() {
        return Duration;
    }

    public int getAveragePercentage() {
        return AveragePercentage;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }
}
