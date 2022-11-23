package numbers;

import java.util.Scanner;

/**
 * Java program to check if a given number is prime or not
 */
public class PrimeNumberCheck
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter input number");
        int input = scanner.nextInt();
        boolean result = checkPrimeOrNot(input);
        System.out.println("The given number is prime " + result);

    }

    /**
     * The below method will check if the number is prime or not.
     *
     * @param input
     * @return true if number is prime else false;
     */
    private static boolean checkPrimeOrNot(int input)
    {
        if (input == 0 || input == 1)
        {
            return false;
        }
        else if (input == 2)
        {
            return true;
        }
        else
        {
            for (int i = 2; i < input/2; i++)
            {
                if (input % i == 0)
                {
                    return false;
                }
            }

        }
        return true;
    }

}
