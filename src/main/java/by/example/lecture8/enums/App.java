package by.example.lecture8.enums;

public class App {

    public static void main(String[] args) {

        Year year = new Year(Season.SPRING);
        System.out.println(year.toString());

        year.setSeason(Season.valueOf("WINTER"));
        System.out.println(year.toString());

//        exception
//        year.setSeason(Season.valueOf("hjfhftgh"));
//        System.out.println(year.toString());

        year.setSeason(Season.SUMMER);
        System.out.println(year.toString());

        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season.name() + ": " + season.getTemperature());
        }

        Season.method();

    }

}
