package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        String word = "ABC";
        int a = word.length();
        Permutation permutation = new Permutation();
        permutation.perm(word, 0, a-1);
    }
    public void perm(String word, int m, int n)
    {
        if (m == n)
            System.out.println(word);
        else
        {
            for (int i = m; i <= n; i++)
            {
                word = swap(word,m,i);
                perm(word, m+1, n);
                word = swap(word,m,i);
            }
        }
    }

    public String swap(String b, int i, int j)
    {
        char temp;
        char[] charArray = b.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
