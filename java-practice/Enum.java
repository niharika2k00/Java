
import java.util.Scanner;

// An Enum class
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Enum {
    Day name;

    // Constructor
    public Enum(Day name) {
        this.name = name;
    }

    public void dayIsLike() {
        switch (name) {
        case MONDAY:
            System.out.println("Mondays are bad. \n");
            break;

        case FRIDAY:
            System.out.println("Fridays are better. \n");
            break;

        case SATURDAY:

        case SUNDAY:
            System.out.println("Weekends are best. \n");
            break;

        default:
            System.out.println("Midweek days are so-so. \n");
            break;
        }
    }

    public static void main(String[] args) {

        String str = "MONDAY";
        Enum obj = new Enum(Day.valueOf(str));
        obj.dayIsLike();

        // all values
        Day arr[] = Day.values();
        for (Day it : arr)
            System.out.println(it + " at index " + it.ordinal());

    }
}
