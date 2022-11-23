package string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program to check if a string contains vowels
 */
public class StringContainVowels
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter input String");
        String inputString = scanner.nextLine();

        boolean result = isStringContainVowels(inputString);
        System.out.println("The String contains vowels using regex = "+result);

         result = isStringContainVowelsUsingMatcher(inputString);
        System.out.println("The String contains vowels using pattern matcher = "+result);


    }

    /**
     * Method which will check if string contain vowels and returns true if so.
     *
     * @param inputString
     * @return true if vowels are there else false.
     */
    private static boolean isStringContainVowels(String inputString)
    {
        if(inputString!=null && inputString.length()>0){
            return inputString.toLowerCase().matches(".*[aeiou].*");
        }
        return false;
    }

    private static boolean isStringContainVowelsUsingMatcher(String inputString)
    {
        if(inputString!=null && inputString.length()>0){

            Pattern pattern = Pattern.compile("[aeiou]");
            Matcher matcher = pattern.matcher(inputString.toLowerCase());
            return matcher.find();
        }
        return false;
    }
}
