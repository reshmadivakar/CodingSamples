package string;

import java.util.Scanner;

/**
 * Below is a program to remove white spaces from a string.
 */
public class RemoveWhiteSpaceString
{
    public static void main(String[] args)
    {

        System.out.println("Please Enter your String");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("User entered string is " + inputString);
        System.out.println("String after removing white space is  " + removeWhiteSpace(inputString));
        System.out.println("String after removing leading and trailing white space is  " + removeLeadTrailWhiteSpace(inputString));

    }

    /**
     * Method to remove white space from a string.
     *
     * @param inputString
     * @return string after removing white space.
     */
    private static String removeWhiteSpace(String inputString)
    {
        if (inputString == null || inputString.isEmpty())
        {
            return inputString;
        }
        else
        {
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = inputString.toCharArray();
            for (char c : chars)
            {
                if (!Character.isWhitespace(c))
                {
                    stringBuilder.append(c);
                }
            }
            return stringBuilder.toString();
        }

    }

    /**
     * The below method will utilise built in function to remove leading and trailing white space.
     * @param inputString
     * @return trimmed string
     */
    private static String removeLeadTrailWhiteSpace(String inputString){
        if (inputString == null || inputString.isEmpty())
        {
            return inputString;
        }
        else
        {
            //by java 11 strip() will remove white space.
           return inputString.trim();
        }

    }
}
