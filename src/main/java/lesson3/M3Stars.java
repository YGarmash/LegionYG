package lesson3;

public class M3Stars {
    public static void main(String[] args) {
        M3Stars printStars = new M3Stars();
        printStars.StarsTemplate(6);
    }

    public void StarsTemplate(int rows) {
        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

