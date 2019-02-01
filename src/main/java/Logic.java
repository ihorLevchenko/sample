public class Logic {


    private String swapiUrl = "https://swapi.co";
    private String swapiPath = "/api/people/1/";

    public Logic() {
        this.swapiUrl = swapiUrl;
        this.swapiPath = swapiPath;
    }

    public String getSwapiUrl() {
        return swapiUrl;
    }

    public void setSwapiUrl(String swapiUrl) {
        this.swapiUrl = swapiUrl;
    }

    public String getSwapiPath() {
        return swapiPath;
    }

    public void setSwapiPath(String swapiPath) {
        this.swapiPath = swapiPath;
    }
}
