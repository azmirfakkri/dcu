import java.util.Scanner;

/**
 * This program will take three inputs: a string, integer and a double
 * The string will be assigned a value
 * The output will be the sum of these three inputs
 *
 */

public class c2a1q3_2019_AzmirFakkri {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string, an integer and a decimal number");

        String str;
        int num1;
        double num2;
        char[] charArray;
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        double totalString = 0;

        System.out.print("Please enter a string: ");
        str = sc.next();

        // lowercase str
        str = str.toLowerCase();
        // create character array
        charArray = str.toCharArray();

        System.out.print("Please enter an integer: ");
        num1 = sc.nextInt();

        System.out.print("Please enter a decimal number: ");
        num2 = sc.nextDouble();

        // for each char, assign a value
        for (char character : charArray) {

            if (letters.indexOf(character) >= 0)
            {
                int charValue = letters.indexOf(character) + 1;
                totalString += charValue;
            }
            else if (numbers.indexOf(character) >= 0)
            {
                int charValue = numbers.indexOf(character);
                totalString += charValue;
            }
        }
        totalString = totalString + num1 + num2;
        System.out.println("The result is: " + totalString);

//        charArray = str.split("(?!^)");
//        System.out.println(Arrays.toString(charArray));  // this will return a String representation of the array

//        System.out.print(letters.indexOf('z'));
    }
}
