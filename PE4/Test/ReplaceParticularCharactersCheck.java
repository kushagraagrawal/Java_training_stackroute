import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReplaceParticularCharactersCheck {

    ReplaceParticularCharacters c;

    @Before
    public void setUp() throws Exception {
        c = new ReplaceParticularCharacters();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void sanityCheck() {
        String queryString = "daily dry";
        String expectedString = "faity fry";
        String actualString = c.ReplaceCharacters(queryString);
        //System.out.println(actualString);
        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void noDorL() {
        String queryString = "maity mry";
        String expectedString = queryString;
        String actualString = c.ReplaceCharacters(queryString);
        Assert.assertEquals(expectedString, actualString);
    }
}
