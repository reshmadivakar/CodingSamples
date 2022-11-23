package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to check if a list contain only odd numbers
 */
public class ListContainOnlyOdd
{
    public static void main(String[] args)
    {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println("Validate if the list contain boolean using for loop "+validateIfListContainOnlyOdd(list));
        System.out.println("Validate if the list contain boolean using for Stream "+validateIfListContainOnlyOdd(list));


    }

    /**
     * The below method will check if the list contain only odd numbers.
     *
     * @param integerList
     * @return true if it contain only odd numbers.
     */
    private static boolean validateIfListContainOnlyOdd(List<Integer> integerList)
    {

        if (integerList == null || integerList.isEmpty())
        {
            return false;
        }
        else
        {
            for (Integer integer : integerList)
            {
                if (integer % 2 == 0)
                {
                    return false;
                }
            }
        }
        return true;

    }

    /**
     * The below method will check if the list contain only odd numbers using stream check if the list is large
     *
     * @param integerList
     * @return true if it contain only odd numbers.
     */
    private static boolean validateIfListContainOnlyOddOptimized(List<Integer> integerList)
    {

        if (integerList == null || integerList.isEmpty())
        {
            return false;
        }
        else
        {
            return integerList.parallelStream().anyMatch(x->x%2==0);
        }

    }
}
