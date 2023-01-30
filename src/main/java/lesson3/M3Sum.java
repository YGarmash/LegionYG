package lesson3;

public class M3Sum {
    public static void main(String[] args) {
        M3Sum calculateSummary = new M3Sum();
        calculateSummary.calculateSum(4, 8);

    }

    public void calculateSum(int a, int b) {
        if(a > b) {
            int sum = 0;
            for (int j = b; j <= a; j++){
                sum = sum + j;
            }
        System.out.println(sum);
        }
        else {
            int sum = 0;
            for (int j = a; j <= b; j++) {
                sum = sum + j;
            }
            System.out.println(sum);

        }

    }
}



