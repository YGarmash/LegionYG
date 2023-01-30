package lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    public enum GameType {
        Soccer,
        Hockey,
        Rugby
    }

    public static void writeNumOfPlayersPerTeam(GameType game) throws IOException {
        String num = "";
        String fileName = "";
        switch (game) {
            case Soccer:
                num = "11";
                fileName = "Soccer.txt";
                break;
            case Hockey:
                num = "6";
                fileName = "Hockey.txt";
                break;
            case Rugby:
                num = "15";
                fileName = "Rugby.txt";
                break;
        }
        createFile(fileName);
        writeToFile(fileName, num);
    }

        public static void createFile(String fileName){
            File file = new File(fileName);

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void writeToFile (String fileName, String num){
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write(num);
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error. cannot write... ");
                e.printStackTrace();
            }
        }
}