import java.util.Scanner;

class Album {
    int year;
    String title;

    Album(int year, String title) {
        this.year = year;
        this.title = title;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Album[] album = {
            new Album(1967, "DavidBowie"), new Album(1969, "SpaceOddity"),
            new Album(1970, "TheManWhoSoldTheWorld"), new Album(1971, "HunkyDory"),
            new Album(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars"),
            new Album(1973, "AladdinSane"), new Album(1973, "PinUps"),
            new Album(1974, "DiamondDogs"), new Album(1975, "YoungAmericans"),
            new Album(1976, "StationToStation"), new Album(1977, "Low"),
            new Album(1977, "Heroes"), new Album(1979, "Lodger"),
            new Album(1980, "ScaryMonstersAndSuperCreeps"), new Album(1983, "LetsDance"),
            new Album(1984, "Tonight"), new Album(1987, "NeverLetMeDown"),
            new Album(1993, "BlackTieWhiteNoise"), new Album(1995, "1.Outside"),
            new Album(1997, "Earthling"), new Album(1999, "Hours"),
            new Album(2002, "Heathen"), new Album(2003, "Reality"),
            new Album(2013, "TheNextDay"), new Album(2016, "BlackStar")
        };

        int q = scanner.nextInt();
        while (q-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int cnt = 0;
            for (int i = 0; i < 25; i++) {
                if (album[i].year >= a && album[i].year <= b) {
                    cnt++;
                }
            }
            System.out.println(cnt);
            for (int i = 0; i < 25; i++) {
                if (album[i].year >= a && album[i].year <= b) {
                    System.out.println(album[i].year + " " + album[i].title);
                }
            }
        }
    }
}