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

    @Test
    public void SmallNumberTest() {
        long expectedAnswer = p.findFinalFactorial(14L);
        long actualAnswer = 14L;
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void LargeNumberTest() {
        long expectedAnswer = p.findFinalFactorial(500L);
        long actualAnswer = 21L;
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

}
