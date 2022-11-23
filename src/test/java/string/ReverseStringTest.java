package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class to string reversal
 */
public class ReverseStringTest
{

    @Test
    public void testReverseString()
    {

        Assertions.assertEquals("esrever", ReverseString.doReverse("reverse"));
        Assertions.assertEquals("ysae si siht", ReverseString.doReverse("this is easy"));

    }

    @Test
    public void testReverseStringInBuilt()
    {
        Assertions.assertEquals("esrever", ReverseString.doReverseInBuilt("reverse"));
        Assertions.assertEquals("ysae si siht", ReverseString.doReverseInBuilt("this is easy"));

    }
}
