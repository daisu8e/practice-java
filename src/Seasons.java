import java.util.ArrayList;

public class Seasons {
    public static void main(String[] args) {
        ArrayList<String> seasons = new ArrayList<String>();
        seasons.add("Spring");
        seasons.add("Summer");
        seasons.add("Fall");
        seasons.add("Winter");
        System.out.println(seasons);

        seasons.set(2, "Autumn");
        System.out.println(seasons);
    }
}
