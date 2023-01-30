package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class M5 {
    public static void main(String[] args) {
        M5 m5 = new M5();

        //Assignment 1.
        m5.arrayDaysOfTheWeek(3);

        //Assignment 2+Optional.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Toy ID: ");
        int id = Integer.parseInt(scanner.next());

        String toy = m5.getToyById(id);

        //Assignment 3.
        ArrayList<String> words = new ArrayList<>();
        words.add("Sunday");
        words.add("Sunday");
        words.add("Monday");
        words.add("Wednesday");
        words.add("Wednesday");
        words.add("Thursday");
        words.add("Friday");
        words.add("Saturday");
        m5.dedupArray(words);


    }


    public String arrayDaysOfTheWeek(int dayOfWeek) {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        if (dayOfWeek == 0) {
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

    public String getToyById(int id) {
        String res;
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(12, "Batmobile");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Woman");
        hashMap.put(201, "Hello Kitty Bag");
        hashMap.put(56, "Junior QA Analyst Doll");

        if (hashMap.get(id) == null) {
            res = "No such Toy";
        } else {
            res = hashMap.get(id);
        }
        System.out.println(res);
        return res;
    }

    public void dedupArray(ArrayList<String> words) {


        HashSet<String> noDuplicates = new HashSet<>(words);
        System.out.println(noDuplicates);
    }
}
