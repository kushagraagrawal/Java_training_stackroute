import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumberTest {

    SortNumber numbertobesorted;

    @Before
    public void setUp() throws Exception {
        numbertobesorted = new SortNumber();
    }

    @Test
    public void firstTestCase() {
        String firstResult = numbertobesorted.sortnumber(12345);
        String answer1 = "54321 6 False";
        Assert.assertEquals(firstResult, answer1);

    }

    @Test
    public void secondTestCase() {
        String firstResult = numbertobesorted.sortnumber(23454);
        String answer1 = "54432 10 False";
        Assert.assertEquals(firstResult, answer1);

    }

    @After
    public void tearDown() throws Exception {
        numbertobesorted = null;
    }
}