package lesson4;

public class M4_2 {

    public static void main(String[] args) {
        M4_2 m4 = new M4_2();
        m4.isPalindrome(null);

    }

    public boolean isPalindrome(String a) {
        String reversed = "";
        boolean res = false;

        if (a == null || a.isEmpty()) {
            System.out.println("String is null or empty");
        } else {
            for (int i = a.length() - 1; i >= 0; i--) {
                reversed = reversed + a.charAt(i);
            }
            res = a.equals(reversed);
        }
        System.out.println("String is palindrome: " + res);
        return res;
    }
}