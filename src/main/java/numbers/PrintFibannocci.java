package numbers;

import java.util.Scanner;

/**
 * Program to print fibanocci series
 */
public class PrintFibannocci
{

    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        printFibannocci(count);

    }

    /**
     * Method to print fibannocci series without recursion.
     *
     * @param count
     */
    private static void printFibannocci(int count)
    {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }

    }

}
