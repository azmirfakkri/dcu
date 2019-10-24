import java.util.Arrays;
import java.util.Scanner;

public class QuestionFourA {

    public static void main(String[] args) {

        for (int index = 1; index < 5; index++) {
            String[] persons = surveyQuestions(index);
            System.out.println(Arrays.toString(persons));
        }
    }

    private static String[] surveyQuestions(int person) {

        Scanner sc = new Scanner(System.in);
        String answer1;
        String answer2;
        String answer3;

        System.out.println("Person " + person);

        //TODO need to create a loop to avoid repetition
        do {
            System.out.print("Do you play football?: ");
            answer1 = sc.next();

            if (!answer1.equals("yes") && !answer1.equals("no")) {
                System.out.println("Answer can only be yes or no, please try again");
            }
        } while (!answer1.equals("yes") && !answer1.equals("no"));

        do {
            System.out.print("Do you swim?: ");
            answer2 = sc.next();

            if (!answer2.equals("yes") && !answer2.equals("no")) {
                System.out.println("Answer can only be yes or no, please try again");
            }
        } while (!answer2.equals("yes") && !answer2.equals("no"));

        do {
            System.out.print("Do you watch movies?: ");
            answer3 = sc.next();

            if (!answer3.equals("yes") && !answer3.equals("no")) {
                System.out.println("Answer can only be yes or no, please try again");
            }
        } while (!answer3.equals("yes") && !answer3.equals("no"));

        return new String[]{answer1, answer2, answer3};
    }
}
