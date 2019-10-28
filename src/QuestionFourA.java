import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionFourA {

    public static void main(String[] args) {
        // String arrayList to store answers from everyone (arrayList of arrays)
        ArrayList<String[]> listOfAnswersFromEveryone = new ArrayList<>();

        for (int index = 1; index < 5; index++) {
            String[] persons = surveyQuestions(index);
            listOfAnswersFromEveryone.add(persons);
        }
        // printing arrays in arrayList
        System.out.println(Arrays.deepToString(listOfAnswersFromEveryone.toArray()));

        // calculate the percentage - another method
        System.out.println(Arrays.toString(listOfAnswersFromEveryone.get(0)));
    }

    private static String[] surveyQuestions(int person) {

        Scanner sc = new Scanner(System.in);
        String answer;

        System.out.println("Person " + person);

        // array of questions (String)
        String[] questions = new String[]{"Do you play football?: ", "Do you swim?: ", "Do you watch movies?: "};
        // String array to store answers from survey questions
        String[] answers = new String[3];

        for (int q = 0; q < questions.length; q++) {
            do {
                System.out.print(questions[q]);
                answer = sc.next();

                if (!answer.equals("yes") && !answer.equals("no")) {
                    System.out.println("Answer can only be yes or no, please try again");
                }
            } while (!answer.equals("yes") && !answer.equals("no"));

            // add every answer into answers array
            answers[q] = answer;

        }

        return answers;
    }

}