package numbers;


import java.util.Scanner;

/**
 * write a program to reverse a string
 */
public class swapNumbers
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter first number");
        int a = scanner.nextInt();
        System.out.println("Please Enter second number");
        int b = scanner.nextInt();
        swap(a,b);

    }

    private static void swap(int a, int b)
    {
        System.out.println("Before swapping a = "+a+" and b = "+b);

        a = a+b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping a = "+a+" and b = "+b);

    }


}
