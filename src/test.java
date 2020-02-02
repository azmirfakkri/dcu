import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alphabet = "[a-zA-Z]+";
        System.out.println("Please enter a 1st letter of the alphabet: ");
        String letter = input.nextLine();
        while (letter.length() != 1 && (!letter.matches(alphabet))) {
            System.out.println(input + "is not a letter.");
        }
        {
            System.exit(0);
        }
    }
}
