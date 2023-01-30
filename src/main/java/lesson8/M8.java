package lesson8;

import java.util.ArrayList;

public class M8 {
    public String arrayDaysOfTheWeek(Integer dayOfWeek) {
        System.out.println("Provided day of the week: " + dayOfWeek);
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        if (dayOfWeek == null) {
            throw new NullPointerException();
        }
        else if (dayOfWeek < 1) {
            return "The number should be equal or larger than 1";
        } else if (dayOfWeek > 7) {
            return "The number should be equal or smaller than 7";
        } else {
            return days.get(dayOfWeek - 1);
        }

    }


}
