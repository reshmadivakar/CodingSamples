package string;

import java.util.Scanner;

/**
 * Program to check if input string is palindrome or not
 */
public class PalindromeString
{
    public static void main(String[] args)
    {
        System.out.println("Please Enter your String");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("User entered string is " + inputString);
        System.out.println("is Palindrome is " + checkIfPalindrome(inputString));

    }

    /**
     * Method which will verify whether the input string provided is palindrome or not
     *
     * @param inputString
     * @return true if palendrome else false.
     */
    private static boolean checkIfPalindrome(String inputString)
    {
        //Invalid string error scenarios
        if (inputString == null || inputString.isEmpty() || inputString.length() < 2)
        {
            return false;
        }
        else
        {
            int length = inputString.length();
            for(int i=0; i < length/2; i++) {
                if(inputString.charAt(i) != inputString.charAt(length-i-1)) {
                   return false;
                }
            }
            return true;

        }
    }

}
