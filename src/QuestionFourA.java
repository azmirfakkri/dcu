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

        // sort these answers into 3 arrays of 4 answers - another method
        String[] question1 = new String[4];
        String[] question2 = new String[4];
        String[] question3 = new String[4];

        question1[0] = listOfAnswersFromEveryone.get(0)[0];
        question2[0] = listOfAnswersFromEveryone.get(0)[1];
        question3[0] = listOfAnswersFromEveryone.get(0)[2];

        question1[1] = listOfAnswersFromEveryone.get(1)[0];
        question2[1] = listOfAnswersFromEveryone.get(1)[1];
        question3[1] = listOfAnswersFromEveryone.get(1)[2];

        question1[2] = listOfAnswersFromEveryone.get(2)[0];
        question2[2] = listOfAnswersFromEveryone.get(2)[1];
        question3[2] = listOfAnswersFromEveryone.get(2)[2];

        question1[3] = listOfAnswersFromEveryone.get(3)[0];
        question2[3] = listOfAnswersFromEveryone.get(3)[1];
        question3[3] = listOfAnswersFromEveryone.get(3)[2];

        System.out.println(Arrays.toString(question1));
        System.out.println(Arrays.toString(question2));
        System.out.println(Arrays.toString(question3));

        // calculate
        double counter = 0;
        for (String s : question1) {
            if (s.equals("yes")) {
                counter++;
            }
        }
        double total = (counter / 4) * 100;
        System.out.println(total);
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

            // add every answer into answers array - [yes, yes, yes]
            answers[q] = answer;

        }

        return answers;
    }

}