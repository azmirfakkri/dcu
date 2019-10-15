/**
 * This Java class will ask for 2 numbers and an operator as input
 * The output is the result of the operation between the 2 numbers
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers and an operator");

        // try catch block for error handling
        try
        {
            System.out.print("Please enter the 1st number: ");

            double num1 = sc.nextDouble();

            System.out.print("Please enter the 2nd number: ");
            double num2 = sc.nextDouble();

            System.out.print("Please enter the operator: ");
            char operator = sc.next().charAt(0);

            // if, else if statements to handle multiple operators specified
            if (operator == '+') {
                double sum = num1 + num2;
                System.out.print("The sum of the numbers is: " + sum);
            } else if (operator == '-') {
                double subtraction = num1 - num2;
                System.out.print("The subtraction of the numbers is: " + subtraction);
            } else if (operator == '*') {
                double multiplication = num1 * num2;
                System.out.print("The multiplication of the numbers is: " + multiplication);
            } else if (operator == '/') {
                double division = num1 / num2;
                System.out.println("The division of the numbers is: " + division);
            } else {
                System.out.println("Invalid operator, please try again");
            }
        }
        catch (InputMismatchException Err)
        {
            System.out.println("Invalid number, please try again");
        }

    }
}
