import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class isEvenCheck {
    isEven p;

    @Before
    public void setUp() throws Exception {
        p = new isEven();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void BasicTest() {
        boolean ActualAnswer = p.checkIfEven(488724);
        boolean ExpectedAnswer = true;
        Assert.assertEquals(ExpectedAnswer, ActualAnswer);
    }
}
