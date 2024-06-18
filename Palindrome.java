import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String palindrome = input.nextLine();

        //Determine if the input is a palindrome
        String message = (isPalindrome(palindrome)) ? palindrome + " is a palindrome." : palindrome + " is not a palindrome.";
        System.out.println(message);

        input.close();
    }

    public static boolean isPalindrome(String str) {
        //Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        //Get the reversed version of the string
        StringBuilder reversed = new StringBuilder(str);
        String reversedStr = reversed.reverse().toString();

        //return if str and reversed are equal
        return str.equals(reversedStr);
    }
}
