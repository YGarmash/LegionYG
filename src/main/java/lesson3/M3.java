package lesson3;

public class M3 {
    public static void main(String[] args) {
        M3 positiveNum = new M3();
        positiveNum.printPositiveInt(1);
    }

    public void printPositiveInt(int i) {
        while (i <= 100) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    System.out.println(" The number " + i + " is divisible by two and three");
                } else {
                    System.out.println(" The number " + i + " is even");
                }
            } else {
                System.out.println(" The number " + i + " is odd");
            }
            if (i % 3 == 0) {
                System.out.println(" The number " + i + " is divisible by three");
            }
            i = i + 1;

        }
    }
}
