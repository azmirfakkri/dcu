import java.util.ArrayList;
import java.util.Scanner;

public class c2a1q4_2019_AzmirFakkri {

    public static void main(String[] args) {
        // String arrayList to store answers from everyone (arrayList of arrays)
        ArrayList<String[]> listOfAnswersFromEveryone = new ArrayList<>();

        // for loop to ask the questions to 4 persons
        for (int index = 1; index < 5; index++) {
            String[] persons = surveyQuestions(index);
            listOfAnswersFromEveryone.add(persons);
        }

        // sort these answers into 3 arrays of 4 answers
        String[] question1 = new String[4];
        String[] question2 = new String[4];
        String[] question3 = new String[4];

        // for loop to sort the answers from every person into 3 questions bucket
        for (int index = 0; index < listOfAnswersFromEveryone.size(); index++ ) {
            question1[index] = listOfAnswersFromEveryone.get(index)[0];
            question2[index] = listOfAnswersFromEveryone.get(index)[1];
            question3[index] = listOfAnswersFromEveryone.get(index)[2];
        }

        // print the survey results
        System.out.println("Survey Results:");
        System.out.println("Do you play football?: " + (int) calculate(question1));
        System.out.println("Do you swim?: " + (int) calculate(question2));
        System.out.println("Do you watch movies?: " + (int) calculate(question3));

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

    private static double calculate(String[] a) {
        // calculate the percentage of yes answers
        double counter = 0;
        for (String s : a) {
            if (s.equals("yes")) {
                counter++;
            }
        }
        return (counter / 4) * 100;
    }

}