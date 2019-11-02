import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int counter = 0;
        int sum = 0;

        // regular while
//        while (i < 100) {
//            System.out.println(i + " ");
//            i++;
//        }

        // keep asking for number till -1 is entered
        while (num != -1) {
            System.out.print("Please enter an integer: ");
            num = sc.nextInt();
            sum += num;
            counter++;
        }
        sum++;
        counter--;
        System.out.println("Number of attempts: " + counter);
        System.out.println("The sum is: " + sum);
    }

}
