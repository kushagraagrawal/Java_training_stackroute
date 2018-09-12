import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EfficientFactorialCheck {

    FindAllFactorials p;

    @Before
    public void setUp() throws Exception {
        p = new FindAllFactorials();

    }

    @After
    public void tearDown() throws Exception {
        p = null;

    }

    @Test
    public void BasicTest() {
        long expectedAnswer = p.findFinalFactorial(25L);
        long actualAnswer = 21L;
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
    /*
    @Test
    public void SmallNumberTest() {
        int expectedAnswer = p.findFinalFactorial(5);
        int actualAnswer = 5;
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
    */
}
