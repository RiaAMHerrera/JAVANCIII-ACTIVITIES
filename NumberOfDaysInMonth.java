import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month (in integer): ");
        int month = input.nextInt();

        System.out.println("Enter the year (in integer): ");
        int year = input.nextInt();

        int numberOfDays = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                numberOfDays = 31;
                break;
            case 4, 6, 9, 11:
                numberOfDays = 30;
                break;
            case 2:
                if (year % 4 == 0)
                    numberOfDays = 29;
                else
                    numberOfDays = 28;
                break;
            default:
                System.out.println("Month entered is invalid.");
                break;
        }
        System.out.println("The number of days in Month " + month + " of Year " + year + " is " + numberOfDays);
        input.close();
    }
}
