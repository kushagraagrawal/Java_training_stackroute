import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatching {

    MatchingStrings x;

    @Before
    public void setUp() throws Exception {
        x = new MatchingStrings();
    }

    @After
    public void tearDown() throws Exception {
        x = null;
    }

    @Test
    public void sanityCheck() {
        String queryString = "She sells seashells by the seashore";
        String toFind = "se";
        List<String> IndicesFound = new ArrayList<>(Arrays.asList("Found at: 4 - 6", "Found at: 10 - 12", "Found at: 27 - 29"));
        List<String> ActualAnswer = x.findingNumberOfSubstring(queryString,  toFind);
        Assert.assertEquals(IndicesFound, ActualAnswer);
    }

    @Test
    public void noOccurrencesFound() {
        String queryString = "She sells seashells by the seashore";
        String toFind = "ku";
        List<String> IndicesFound = new ArrayList<>(Arrays.asList("Not found"));
        List<String> ActualAnswer = x.findingNumberOfSubstring(queryString,  toFind);
        Assert.assertEquals(IndicesFound, ActualAnswer);
    }

    
}
