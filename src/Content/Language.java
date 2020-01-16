package Content;

public class Language {
    private String LanguageId;
    private String Name;

    public Language(String LanguageId,String Name){
        this.LanguageId = LanguageId;
        this.Name = Name;
    }

    public String getLanguageId() {
        return LanguageId;
    }

    public String getName() {
        return Name;
    }
}
