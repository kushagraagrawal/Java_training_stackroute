import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveVowelsCheck {

    RemoveVowels x;

    @Before
    public void setUp() throws Exception {
        x = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        x = null;
    }

    @Test
    public void sanityCheck() {
        String[] Locations = {"India", "United States", "Germany", "Egypt", "Czechoslovakia"};
        String[] ExpectedAnswer = {"Ind", "Untd Stts", "Grmny", "Egypt", "Czchslvk"};
        String[] ActualAnswer = x.removevowels(Locations);
        Assert.assertArrayEquals(ExpectedAnswer, ActualAnswer);
    }

    // Further test cases to be added


}
