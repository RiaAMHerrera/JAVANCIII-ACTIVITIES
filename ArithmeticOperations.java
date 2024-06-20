// Create a a program where user inputs two numbers //
// and perform 4 basic arithmetic operations //
// using 4 methods with return types and print the results. //

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        double number1;

        //Ensure that the first input is double
        while (true) {
            System.out.print("Enter the first number: ");
            if (input1.hasNextDouble()) {
                number1 = input1.nextDouble();
                break;
            } else {
                System.out.println("Invalid input.");
                input1.next();
            }
        }

        Scanner input2 = new Scanner(System.in);
        double number2;

        //Ensure that the second input is double
        while (true) {
            System.out.print("Enter the second number: ");
            if (input2.hasNextDouble()) {
                number2 = input2.nextDouble();
                break;
            } else {
                System.out.println("Invalid input.");
                input2.next();
            }
        }

        double sumResult = add(number1, number2);
        System.out.println("Sum: " + sumResult);

        double differenceResult = subtract(number1, number2);
        System.out.println("Difference: " + differenceResult);

        double productResult = multiply(number1, number2);
        System.out.println("Product: " + productResult);

        double quotientResult = divide(number1, number2);
        System.out.println("Quotient: " + quotientResult);

        input1.close();
        input2.close();
    }

    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public static Double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Unable to divide by zero.");
            return Double.NaN;
        }
    }
}
