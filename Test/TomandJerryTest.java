import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomandJerryTest {

    TomandJerry numbertobechecked;

    @Before
    public void setUp() throws Exception {
        numbertobechecked = new TomandJerry();
    }

    @After
    public void tearDown() throws Exception {
        numbertobechecked = null;
    }

    @Test
    public void firstTestCase() {
        String firstCase = numbertobechecked.tomjerry(5100);
        String answerFirstCase = "error";
        Assert.assertEquals(firstCase, answerFirstCase);

    }
    @Test
    public void secondTestCase() {
        String secondCase = numbertobechecked.tomjerry(770000);
        String answerSecondCase = "error";
        Assert.assertEquals(secondCase, answerSecondCase);

    }
}