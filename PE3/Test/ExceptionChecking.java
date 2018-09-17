import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExceptionChecking {

    CheckingException x;

    @Before
    public void setUp() throws Exception {
        x = new CheckingException();
    }

    @After
    public void tearDown() throws Exception {
        x = null;
    }

    @Test
    public void sanityCheck() {
        int a[] = {10, 20,30, 40,50, 60};
        int index = 8;
        String expectedAnswer = "IndexOutOfBoundsException";
        String actualAnswer = x.checkForExceptions(a, index, a.length);
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void negativeIndexCheck() {
        int a[] = {10, 20, 30};
        int index = 1;
        String expectedAnswer = "NegativeArraySizeException";
        String actualAnswer = x.checkForExceptions(a,0, -8);
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void nullPointerCheck() {
        String str = null;
        String expectedAnswer = "NullPointerException";
        String actualAnswer = x.checkForNullExceptions(str);
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
}
