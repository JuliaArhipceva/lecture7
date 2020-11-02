package by.example.lecture8.enums;

public class Year {

    private Season season;

    public Year(Season season) {
        this.season = season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Year{" +
                "season=" + season +
                '}';
    }

}
