import java.util.Scanner;

public class ScoreToGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score;

        //Ensure that the input is 0-100 only
        do {
            System.out.println("Enter the score (0-100): ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter the month in integer.");
                input.next();
            }
            score = input.nextInt();
        } while (score < 0 || score > 100);

        //Determine the grade based on the score
        String message = "A score of " + score + " gets ";
        if (score >= 90) {
            System.out.println(message + "an A grade.");
        } else if (score >= 80) {
            System.out.println(message + "a B grade.");
        } else if (score >= 70) {
            System.out.println(message + "a C grade.");
        } else if (score >= 60) {
            System.out.println(message + "a D grade.");
        } else {
            System.out.println(message + "an F grade.");
        }

        input.close();
    }
}
