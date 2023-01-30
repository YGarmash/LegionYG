package lesson2;

public class Lesson2Main {
    public static void main(String[] args) {
        String txt = " Hello ";
        String name = " Vasiliy Pupkin ";
        int a = -5;
        int b = 8;
        int c = 6;
        int result1 = (int) a + b * c;
        int d = 20;
        int f = -3;
        int e = 5;
        double result2 = (double) d + f*e / b;
        double doublenum1 = 1.1;
        double doublenum2 = 1.2;
        double doublenum3 = 1.3;
        double doublenum4 = 1.4;
        double doublenum5 = 1.5;
        double result3 = doublenum1*doublenum2*doublenum3*doublenum4*doublenum5 ;

        System.out.println(txt);
        System.out.println(name);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println( "number "+doublenum1 +" * number "+doublenum2+" * number " +doublenum3+" * number " +doublenum4+" * number " +doublenum5 +" equals " + result3);
    }
}
