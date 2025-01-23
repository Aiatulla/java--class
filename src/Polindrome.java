import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type word to check if it is a palindrome:");

        String word = input.next();
        boolean res = Is_palindrome(word);
        System.out.println(res);
    }

    public static boolean Is_palindrome(String word) {
        int len = word.length();
        int mid = len / 2;

        String A = word.substring(0, mid);
        String B = word.substring(len - mid);

        StringBuilder reversed_B = new StringBuilder(B);
        reversed_B.reverse();

        return A.equals(reversed_B.toString());
    }
}
