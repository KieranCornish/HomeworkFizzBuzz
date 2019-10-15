import java.sql.SQLOutput;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
    fizzBuzz(0 ,0);
    }
    public static void fizzBuzz (int a, int y) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        a = scanner.nextInt();

        System.out.println("Enter another number ");
        y = scanner.nextInt();

        for (int i = a; i <= y; i++ ) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
