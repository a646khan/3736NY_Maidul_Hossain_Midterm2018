package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int a = 0, b = 0, c = 1;
        System.out.println("First 40 Fibonacci numbers :");
        for(int i = 1; i <= 40; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }

    }
}
