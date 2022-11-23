package collections;

import java.util.Arrays;
import java.util.List;

/**
 * The below class will make use of sequential and parallel streams to manipulate data from a
 * data source
 */
public class StreamTypes
{


    public static void main(String[] args)
    {

        List<String> list = Arrays.asList("Hello ", "G", "E", "E", "K", "S!");

        // we are using stream() method for sequential stream Iterate and print each element of the stream
        System.out.println("Below sequential stream always maintains order");
        list.stream().forEach(System.out::println);

        //we are using Collection.parallelStream() to create parallel stream to iterate and print each element.
        System.out.println("Below parallel stream doesn't maintains order");
        list.parallelStream().forEach(System.out::println);


        //Below is another way to create parallel stream.
        System.out.println("Below is another way to create parallel stream, again it also doesn't maintains order");
        list.stream().parallel().forEach(System.out::println);

    }

}
