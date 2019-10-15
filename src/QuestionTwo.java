import java.util.Scanner;

/**
 * This program will ask 3 inputs: a string and 2 numbers
 * It will give a substring based on the index specified by the 2 numbers
 */

public class QuestionTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string and two numbers. The number can be 0 or greater than 0");

        // ask for a string
        System.out.print("Please enter a string: ");
        String word = sc.next();

        // get length of the string
        int str_len = word.length();

        // ask for 1st number
        System.out.print("Please enter the 1st index: ");


        int num1 = sc.nextInt();


        // add catch exception

        // ask for 2nd number
        System.out.print("Please enter the 2nd index: ");
        int num2 = sc.nextInt();
        int num3 = num2 + 1;

        // print out the letter based on the number provided
        System.out.print("The substring from index " + num1 + " to index " + num2 + " is: ");
        System.out.println(word.substring(num1, num3));
    }
}
