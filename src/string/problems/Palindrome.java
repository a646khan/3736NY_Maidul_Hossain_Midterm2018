package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        palindrome("mom");
    }
    public static void palindrome(String word)
    {
        String reverse = new StringBuffer(word).reverse().toString();

        if (word.equals(reverse))
            System.out.println("The string is palindrome");

        else
            System.out.println("The string is not palindrome");
    }
}
