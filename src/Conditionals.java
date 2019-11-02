import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        if (num == 1)
//            System.out.println("one"); // if there is only one statement, not necessary to put the braces
//        else if (num == 2)
//            System.out.println("two");
//        else if (num == 3)
//            System.out.println("three");
//        else  // no condition on the else statement
//            System.out.println("none matched");

        if (num >= -9 && num <= 9) {
            System.out.println("One digit");
        }
        else if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) {
            System.out.println("Two digits");
        }
        else if ((num >= 100 && num <= 999) || (num <= -100 && num >= -999)) {
            System.out.println("Three digits");
        }
        else {
            System.out.println("More than three digits");
        }
    }
}
