import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingWordsCheck {

    SortingWords c;

    @Before
    public void setUp() throws Exception {
        c = new SortingWords();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void sanityCheck() {
        String queryString = "Cd Dc Ab Ba";
        List<String> sortedWords = new ArrayList<>(Arrays.asList("Ab","Ba","Cd","Dc"));
        List<String> actualSortedWords = c.SortWords(queryString);
        Assert.assertEquals(sortedWords, actualSortedWords);
    }

    @Test
    public void loremIpsumCheck() {
        String queryString = "Ge?ks Ge!ks";
        List<String> sortedWords = new ArrayList<>(Arrays.asList("Ge?ks", "Ge!ks"));
        List<String> actualSortedWords = c.SortWords(queryString);
        System.out.println(actualSortedWords);
        Assert.assertEquals(sortedWords, actualSortedWords);
    }
}
