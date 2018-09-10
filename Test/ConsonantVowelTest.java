import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsonantVowelTest {
    ConsonantVowel firsttestcase;

    @Before

    public void setUp(){

        firsttestcase = new ConsonantVowel();
    }

    @After

    public void tearDown(){

        firsttestcase = null;
    }
    @Test
    public void firstTestCase() {

        String ap = firsttestcase.consonantvowel("ap");
        String answerexpected = "Vowel Consonant";
        Assert.assertEquals(ap, answerexpected);
    }

    @Test
    public void specialCharacterString() {

        String secondcase = firsttestcase.consonantvowel("!!!");
        String answerexpected = "error error error";
        Assert.assertEquals(secondcase, answerexpected);
    }

}
