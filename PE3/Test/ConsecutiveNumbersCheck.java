import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsecutiveNumbersCheck {

    ConsecutiveNumbers p;

    @Before
    public void setUp() throws Exception {
        p = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void sanityCheck() {
        String testcase="98,96,95,94,93";
        String ExpectedAnswer = testcase + " non consecutive numbers";
        String ActualAnswer = p.checkifConsecutive(testcase);

        Assert.assertEquals(ActualAnswer, ExpectedAnswer);
    }

    @Test
    public void consecutiveCheck() {
        String check = "54,53,52,51,50,49,48";
        String ExpectedAnswer = check + " are consecutive numbers";
        String ActualAnswer = p.checkifConsecutive(check);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);
    }

    @Test
    public void repeatedElementCheck() {
        String check = "1,2,3,4,5,6,6";
        String ExpectedAnswer = check + " non consecutive numbers";
        String ActualAnswer = p.checkifConsecutive(check);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);
    }

    @Test
    public void negativeNumbersCheck() {
        String check = "-1,0,1,2,-2,-3,-4";
        String ExpectedAnswer = check + " are consecutive numbers";
        String ActualAnswer = p.checkifConsecutive(check);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);
    }
}
