import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FirstTestClass {
    @Test
    public void TestingClass() throws Exception {
        Mood moodAnalyzer = new Mood();

        String this_is_sad = moodAnalyzer.analyzeMood("This is sad");

        Assert.assertThat(this_is_sad, CoreMatchers.is("SAD"));


        //palindrom.palindrome();
    }

    @Test
    public void testHappyMood() throws Exception {
        Mood moodanalyze = new Mood();

        String this_is_happy = moodanalyze.analyzeMood("This is happy");

        Assert.assertThat(this_is_happy, CoreMatchers.is("HAPPY"));

    }
}
