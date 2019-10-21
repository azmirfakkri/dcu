import java.util.Scanner;

/**
 * This program will ask for a sentence and will output
 * the sentence in reverse
 */

public class QuestionOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence to be reversed");
        String sentence;

        do {
            // ask for a sentence
            System.out.print("Please enter a sentence: ");
            sentence = sc.nextLine();

            StringBuilder sb = new StringBuilder(sentence);
            System.out.println("The reversed sentence is: " + sb.reverse().toString());
        } while (!sentence.equals("exit"));

        }
    }
