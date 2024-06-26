import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        //Ensure that the input is integer
        while (true) {
            System.out.print("Enter an integer: ");
            if (input.hasNextInt()) {
                number = input.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
        }

        // Determine if the number is odd or even
        String messageOddEven = (number % 2 == 0) ? "Entered number " + number + " is even" : "Entered number " + number + " is odd";
        System.out.println(messageOddEven);

        // Determine if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("and is positive.");
        } else if (number < 0) {
            System.out.println("and is negative.");
        } else {
            System.out.println("and is zero.");
        }

        input.close();
    }
}
