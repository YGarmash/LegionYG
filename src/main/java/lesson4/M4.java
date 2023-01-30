package lesson4;

import lesson6.Employee;
import lesson7.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class M4 {

    public static void main(String[] args) throws IOException {
//        M4 m4 = new M4();
//        m4.compareStrings( "", "boyfriend");
        Game game = new Game();
        game.writeNumOfPlayersPerTeam(Game.GameType.Hockey);
    }

    public void compareStrings(String a, String b) {
        if (a == null || b == null) {
        System.out.println("Cannot compare Strings");
        }
        else if (a.equals(b)){
            System.out.println("The Strings are the same");
        }
        else if (a.contains(b)) {
            System.out.println(b +" is the part of " + a);
        }
        else if (b.contains(a)) {
            System.out.println(a + " is the part of " + b);
        }
        else
        {
            System.out.println( "The Strings are not the same, are not null and not contain each other");
        }

    }
}