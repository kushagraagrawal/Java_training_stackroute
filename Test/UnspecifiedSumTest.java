import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class UnspecifiedSumTest {

    UnspecifiedSum p;

    @Before
    public void setUp() throws Exception {
        p = new UnspecifiedSum();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void testGeneral() {
        int testcase2 = p.Sumofunspecified("12 23 2 4");
        int answer2 = 41;
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testofAlphabet() {
        int testcase2 = p.Sumofunspecified("12 23 2 A");
        int answer2 = 37;
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testofSpecialCharacter() {
        int testcase2 = p.Sumofunspecified("12 23 2 $");
        int answer2 = 37;
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testofLongString() {
        int testcase2 = p.Sumofunspecified("12 23 2 12 23 2 12 23 2 12 23 2 12 23 2 12 23 2 12 23 2 12 23 2 12 23 2 12 23 2 ");
        int answer2 = 370;
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testofSingleNumber() {
        int testcase2 = p.Sumofunspecified("12");
        int answer2 = 12;
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testofNegative() {
        int testcase2 = p.Sumofunspecified("12 -12 37");
        int answer2 = 37;
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testofFloat() {
        int testcase2 = p.Sumofunspecified("12 1.2 37");
        int answer2 = 12;
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testofNull() {
        int testcase2 = p.Sumofunspecified("12 null 37");
        int answer2 = 12;
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testofLotofNumbers() {
        int testcase2 = p.Sumofunspecified("12 100000000 37");
        int answer2 = 100000049;
        Assert.assertEquals(testcase2,answer2);
    }
}