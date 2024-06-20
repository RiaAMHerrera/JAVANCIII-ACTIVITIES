import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int month;
        int numberOfDays = 0;

        //Ensure that the month input is 1-12 only
        do {
            System.out.println("Enter the month (1-12): ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter the month in integer: ");
                input.next();
            }
            month = input.nextInt();
        } while (month <= 0 || month > 12);

        //Determine how many days in the entered month
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> numberOfDays = 31;
            case 4, 6, 9, 11 -> numberOfDays = 30;
            case 2 -> {

                Scanner input2 = new Scanner(System.in);
                int year;

                //Ensure that the year input is > 0
                do {
                    System.out.println("Enter a year > 0: ");
                    while (!input2.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a year > 0: ");
                        input2.next();
                    }
                    year = input2.nextInt();
                } while (year <= 0);

                if (year % 4 == 0)
                    numberOfDays = 29;
                else
                    numberOfDays = 28;

                input2.close();
            }
        }
        System.out.println("The number of days is " + numberOfDays);
        input.close();

    }
}


