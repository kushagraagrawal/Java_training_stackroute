import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfOccurrencesCheck {

    NumberOfOccurences c;

    @Before
    public void setUp() throws Exception {
        c = new NumberOfOccurences();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void sanityCheck() {
        String queryString = "Java is java again java again";
        char tobeCounted = 'a';
        int numberOfOccurrencesExpected = 10;
        int numberOfOccurencesActual = c.findCharinString(queryString, tobeCounted);
        Assert.assertEquals(numberOfOccurrencesExpected, numberOfOccurencesActual);
    }

    @Test
    public void noOccurencePresent() {
        String queryString = "aaaaaaaaaaaaaaaaaaaaaaaa";
        char tobeCounted = 'z';
        int numberOfOccurrencesExpected = 0;
        int numberOfOccurencesActual = c.findCharinString(queryString, tobeCounted);
        Assert.assertEquals(numberOfOccurrencesExpected, numberOfOccurencesActual);
    }

    @Test
    public void OnlyThatCharacterPresent() {
        String queryString = "aaaa aaaa aaaa";
        char tobeCounted = 'a';
        int numberOfOccurrencesExpected = 12;
        int numberofOccurencesActual = c.findCharinString(queryString, tobeCounted);
        Assert.assertEquals(numberOfOccurrencesExpected, numberofOccurencesActual);
    }
}
