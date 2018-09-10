import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumRepeatTest {

    NumRepeat firstnumber;

    @Before
    public void setUp() throws Exception{
        firstnumber = new NumRepeat();
    }

    @Test
    public void firstTestCase() {
        String testcase1 = firstnumber.numrepeat(5);
        String answer1 = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5";
        Assert.assertEquals(testcase1, answer1);

    }

    @Test
    public void secondTestCase() {
        String testcase2 = firstnumber.numrepeat(-1);
        String answer2 = "Null";
        Assert.assertEquals(testcase2, answer2);
    }

    @After
    public void tearDown() throws Exception {
        firstnumber = null;
    }
}
