import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class RepeatCharactersTest {

    RepeatCharacters p;
    @Before
    public void setUp() throws Exception {
        p = new RepeatCharacters();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }



    @Test
    public void testForSpecialCharacter() {
        String testcase2 = p.Repeatchar("anshul$",4);
        String answer2 = "anshul$hul$hul$hul$hul$";
        Assert.assertEquals(testcase2,answer2);

    }

    @Test
    public void testForNumber() {
        String testcase2 = p.Repeatchar("anshul1",4);
        String answer2 = "anshul1hul1hul1hul1hul1";
        Assert.assertEquals(testcase2,answer2);

    }

    @Test
    public void testForLongString() {
        String testcase2 = p.Repeatchar("anshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshul$",4);
        String answer2 = "anshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshulanshul$hul$hul$hul$hul$";
        Assert.assertEquals(testcase2,answer2);

    }

    @Test
    public void testForCapital() {
        String testcase2 = p.Repeatchar("Anshul$",4);
        String answer2 = "Anshul$hul$hul$hul$hul$";
        Assert.assertEquals(testcase2,answer2);

    }


    @Test
    public void testForZeroLength() {
        String testcase2 = p.Repeatchar("Anshul$",0);
        String answer2 = "Anshul$";
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void testForShortLength() {
        String testcase2 = p.Repeatchar("Anshul$",8);
        String answer2 = "ERROR";
        Assert.assertEquals(testcase2,answer2);
    }

}