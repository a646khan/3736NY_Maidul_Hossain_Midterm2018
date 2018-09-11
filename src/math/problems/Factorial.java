package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        int n = 5;

        // Recursion :
        int result1 = factorial(n);
        System.out.println("The factorial of 5 using Recursion = " + result1);

        // Iteration :
        int result2 = 1;
        for (int i = 1; i <= n; i++) {
            result2 = result2 * i;
        }
        System.out.println("The factorial of 5 using Iteration = " + result2);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
