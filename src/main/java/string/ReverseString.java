package string;


import java.util.Scanner;

/**
 * write a program to reverse a string
 */
public class ReverseString
{

    public static void main(String[] args)
    {

        System.out.println("Please Enter your String");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Reversed String using built in function is "+doReverseInBuilt(inputString));
        System.out.println("Reversed String without using built in function is "+doReverse(inputString));

    }

    /**
     * Reverse a string using inbuilt reverse function.
     * @param s
     * @return reversed string
     */
    public static String doReverseInBuilt(String s)
    {
        if (s.length() > 0)
        {
            StringBuilder  stringBuilder = new StringBuilder();
            stringBuilder.append(s);
            stringBuilder.reverse();
            return stringBuilder.toString();

        }
        return null;
    }

    /**
     * Reverse a string without using in built functions.
     * @param s
     * @return reversed string
     */
    public static String doReverse(String s)
    {
        if (s.length() > 0)
        {
            char[] chars = s.toCharArray();
            StringBuilder str  = new StringBuilder();

            for (int i = chars.length-1;i>=0;i--)
            {
                str.append(chars[i]);
            }

            return str.toString();
        }
        return null;
    }
}
