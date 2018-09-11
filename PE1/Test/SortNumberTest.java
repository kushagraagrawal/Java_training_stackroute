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
        String firstResult = numbertobesorted.sortnumber(23464);
        String answer1 = "64432 16 True";
        Assert.assertEquals(firstResult, answer1);

    }

    @Test
    public void thirdTestCase() {
        String firstResult = numbertobesorted.sortnumber(13579013579L);
        String answer2 = "99775533110 0 False";
        Assert.assertEquals(firstResult, answer2);
    }

    @Test
    public void fourthTestCase() {
        String fourthResult = numbertobesorted.sortnumber(-23456);
        String answer4 = "-65432 12 False";
        Assert.assertEquals(fourthResult, answer4);
    }

    @After
    public void tearDown() throws Exception {
        numbertobesorted = null;
    }
}