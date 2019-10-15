import java.util.Scanner;

public class BasicIO {

    // this is the main method
    public static void main(String[] args) {
        /*
        System.out.println("Hello \" World!");
        System.out.println("C2 class");
        System.out.println(2 + 3);
        System.out.println("2 + 3");
        System.out.println(2 + "3");
        System.out.println("2" + 3);

        int num1;
        int num2;
        int num3, num4;
        int num5 = 10;
        num1 = 30;
        num2 = 40;
        num3 = num1 + num2;
        num4 = num3 * num5;
        System.out.println("The sum is: " + num3);
        System.out.println("Multiplication product: " + num4);

        double dnum1 = 25; // can put int in double
        int inum1 = 25; // only int, no decimal allowed
        System.out.println(dnum1/2); // result is double if one data type is double
        System.out.println(inum1/2); // result is int
        System.out.println(inum1/2.0); // result is double

        char ch1 = 'a'; // should use single quotes
        System.out.println(ch1);

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a double: ");
        double num1 = sc.nextDouble();
        System.out.print("Please enter a double: ");
        double num2 = sc.nextDouble();
        double sum = num1 + num2; // cannot store double as integer
        double mul = num1 * num2;
        double div = num1 / num2;
        double sub = num1 - num2;
        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
        System.out.println("Div: " + div);
        System.out.println("Sub: " + sub);

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Giz a string: ");
        char ch1 = sc.next().charAt(0);
        System.out.println("The first character is: " + ch1);

        // create a calculator that takes 2 input and an operand
        // the 2 input should work based on the operand given 

    }
}
