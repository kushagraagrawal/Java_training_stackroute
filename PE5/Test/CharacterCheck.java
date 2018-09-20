import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CharacterCheck {
    FrequencyOfCharacters x;

    @Before
    public void setUp() throws Exception {
        x = new FrequencyOfCharacters();
    }

    @After
    public void tearDown() throws Exception {
        x =null;
    }

    @Test
    public void sanityCheck() {
        String[] queryChars = {"a","b","c","d","a","c","c"};
        Map<String, Boolean> ExpectedAnswer = new HashMap<>();
        ExpectedAnswer.put("a", true);
        ExpectedAnswer.put("b", false);
        ExpectedAnswer.put("c", true);
        ExpectedAnswer.put("d", false);

        Map<String, Boolean> ActualAnswer = x.findFrequency(queryChars);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);

    }

    @Test
    public void basicTest() {
        String[] queryChars = {"e","f","g","d","a","k","c"};
        Map<String, Boolean> ExpectedAnswer = new HashMap<>();
        ExpectedAnswer.put("a", false);
        ExpectedAnswer.put("k", false);
        ExpectedAnswer.put("c", false);
        ExpectedAnswer.put("d", false);
        ExpectedAnswer.put("g", false);
        ExpectedAnswer.put("f", false);
        ExpectedAnswer.put("e", false);

        Map<String, Boolean> ActualAnswer = x.findFrequency(queryChars);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);

    }
}
