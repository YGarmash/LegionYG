package lesson4;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("");
    }
    public void reverseString(String textToReverse) {
        if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()) {
            System.out.println(" The String is null or empty");

        }
        System.out.println(String.format("the input string is %s", textToReverse));
        String result = "";
        int lastLetter = textToReverse.length()-1;
        for (int i = lastLetter; i>=0; i--) {
            result = result + textToReverse.charAt(i);
        }
            System.out.println(result);
        }
    }
