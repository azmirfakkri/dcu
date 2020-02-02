import java.util.Arrays;
import java.util.Scanner;

public class c2a2q1_2020_AzmirFakkri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char firstChar;
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int totalChar;

        // array to store valid char
        char[] validChar = new char[3];

        do {
            // for loop to ask the question three times
            for (int i = 0; i < 3; i ++) {

                // do-while loop to keep asking the question if it is not a valid character
                do {
                    System.out.print("Please enter a letter of the alphabet: ");

                    // get the first character
                    firstChar = sc.next().charAt(0);

                    // check if it is in letters
                    if (letters.contains(Character.toString(firstChar))) {

                        // if True, save it into an array
                        validChar[i] = firstChar;
                    }
                    else {
                        System.out.println("Invalid entry.");
                    }

                } while (!letters.contains(Character.toString(firstChar)));
            }

            System.out.println("You entered: " + Arrays.toString(validChar));

            // if the loop is repeated due to invalid password, reset totalChar to zero
            totalChar = 0;

            // for loop to get the sum of character
            for (char character : validChar) {

                if (letters.indexOf(character) <= 25) {
                    int charValue = letters.indexOf(character) + 1;
                    totalChar += charValue;
                }
                else {
                    int charValue = letters.indexOf(character) + 75;
                    totalChar += charValue;
                }
            }

            System.out.println("The sum of the values is " + totalChar);

            if (totalChar % 5 == 0) {
                System.out.println("Password unlocked!");
            }
            else {
                System.out.println("Incorrect password. Please try again.");
            }

        } while (totalChar % 5 != 0);

    }
}
