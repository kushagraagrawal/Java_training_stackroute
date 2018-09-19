import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindHarryCheck {

    FindHarry x;

    @Before
    public void setUp() throws Exception {
        x = new FindHarry();
    }

    @After
    public void tearDown() throws Exception {
        x = null;
    }

    @Test
    public void sanityCheck() {
        String queryString = "This is Harry.";
        String expectedAnswer = "true";
        String actualAnswer = x.findHarry(queryString);
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void henryCheck() {
        String queryString = "This is Henry";
        String expectedAnswer = "false";
        String actuaLAnswer = x.findHarry(queryString);
        Assert.assertEquals(expectedAnswer, actuaLAnswer);
    }

    @Test
    public void nameInAString() {
        String queryString = "This is Harry.Potter";
        String expectedAnswer = "true";
        String actualAnswer = x.findHarry(queryString);
        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
}
