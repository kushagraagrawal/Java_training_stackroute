import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCountsCheck {

    NumberOfCounts c;

    @Before
    public void setUp() throws Exception {
        c = new NumberOfCounts();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void sanityCheck() {
        String queryString = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> ActualAnswer = c.getCount(queryString);
        Map<String, Integer> ExpectedAnswer = new HashMap<>();
        ExpectedAnswer.put("one", 5);
        ExpectedAnswer.put("two", 2);
        ExpectedAnswer.put("three", 2);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);
    }

    @Test
    public void secondStringCheck() {
        String queryString = ".four. five@six one -one___two,,three,one @three*one?two";
        Map<String, Integer> ActualAnswer = c.getCount(queryString);
        Map<String, Integer> ExpectedAnswer = new HashMap<>();
        ExpectedAnswer.put("one", 4);
        ExpectedAnswer.put("two", 2);
        ExpectedAnswer.put("three", 2);
        ExpectedAnswer.put("four", 1);
        ExpectedAnswer.put("five", 1);
        ExpectedAnswer.put("six", 1);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);
    }
}
