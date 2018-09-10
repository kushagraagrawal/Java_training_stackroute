import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString p;
    @Before
    public void setUp() throws Exception {
        p = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void testForCapital() {
        String testcase = p.reversestring("loNdon");
        String answer = "n o d N o l";
        Assert.assertEquals(testcase, answer);
    }

    @Test
    public void testForSpecialCharacter() {
        String testcase = p.reversestring("lon&don");
        String answer = "n o d & n o l";
        Assert.assertEquals(testcase, answer);
    }

    @Test
    public void testForLongString() {
        String testcase = p.reversestring("qwertyuiopasdfghjklzxcvbnm");
        String answer = "m n b v c x z l k j h g f d s a p o i u y t r e w q";
        Assert.assertEquals(testcase, answer);
    }

    @Test
    public void testForNumber() {
        String testcase = p.reversestring("qwerty10");
        String answer = "0 1 y t r e w q";
        Assert.assertEquals(testcase, answer);
    }
}