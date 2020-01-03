import java.util.Scanner;

public class c2a2q1_2020_AzmirFakkri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // array to store valid char
        char[] validChar = new char[3];

        System.out.print("Please enter a letter of the alphabet: ");

        // get the first character
        a = sc.next().charAt(0);

        // check if it is in letters
        if (letters.contains(Character.toString(a))) {
            // if True, save it into an array
            System.out.println(a);
        }
        else {
            System.out.println("Invalid entry. Please enter a letter of the alphabet: ");
        }
    }
}
