import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Val1andVal2 {

    SwitchingVal1and2 c;

    @Before
    public void setUp() throws Exception {
        c = new SwitchingVal1and2();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void sanityCheck() {
        Map<String, String> Val1and2 = new HashMap<>();
        Val1and2.put("val1", "java");
        Val1and2.put("val2", "c++");
        Map<String, String> ExpectedAnswer = new HashMap<>();
        ExpectedAnswer.put("val1", " ");
        ExpectedAnswer.put("val2", "java");

        Map<String, String> ActualAnswer = c.switchemboth(Val1and2);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);
    }

    @Test
    public void secondTest() {
        Map<String, String> Val1and2 = new HashMap<>();
        Val1and2.put("val1", "mars");
        Val1and2.put("val2", "saturn");
        Map<String, String> ExpectedAnswer = new HashMap<>();
        ExpectedAnswer.put("val1", " ");
        ExpectedAnswer.put("val2", "mars");

        Map<String, String> ActualAnswer = c.switchemboth(Val1and2);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);
    }

    @Test
    public void val1Empty() {
        Map<String, String> Val1and2 = new HashMap<>();
        Val1and2.put("val1", null);
        Val1and2.put("val2", "saturn");
        Map<String, String> ExpectedAnswer = new HashMap<>();
        ExpectedAnswer.put("val1", null);
        ExpectedAnswer.put("val2", "saturn");

        Map<String, String> ActualAnswer = c.switchemboth(Val1and2);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);
    }
}
