package hello;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    /**
     * Test the return with empty parameter
     */
    public void testHelloEmptyParameter() {
        assertEquals("Hello World!", Main.hello());
    }

    /**
     * Test the return with a parameter
     */
    public void testHelloParameter() {
        assertEquals("Hello Hugo!", Main.hello("Hello Hugo!"));
    }
}
