import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.AccessibleObject;

public class TransposeStringCheck {

    TransposeString c;

    @Before
    public void setUp() throws Exception {
        c = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void sanityCheck() {
        String queryString = "a quick brown fox jumps over the lazy dog";
        String expectedString = "a kciuq nworb xof spmuj revo eht yzal god";
        String actualString = c.findTranspose(queryString);
        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void emptyString() {
        String queryString = "";
        Assert.assertNull(c.findTranspose(queryString));
    }

    @Test
    public void checkName() {
        String queryString = "Kushagra Agrawal";
        String expectedString = "argahsuK lawargA";
        String actualString = c.findTranspose(queryString);
        Assert.assertEquals(expectedString, actualString);
    }
}
