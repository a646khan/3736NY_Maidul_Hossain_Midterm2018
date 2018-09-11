package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
         int a = 10;

         int sumOf10numbers = sumOf10numbers(a);

         int sumOf9Elements = sumOf9Elements(array);

         int result = sumOf10numbers - sumOf9Elements;

         System.out.println("Missing number from the array = "+result);
    }

    static int sumOf10numbers(int a)
    {
        int sum = (a * (a+1))/ 2;

        return sum;
    }

    static int sumOf9Elements(int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        return sum;
    }
}
