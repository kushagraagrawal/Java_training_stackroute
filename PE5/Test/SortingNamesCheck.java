import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class SortingNamesCheck {

    SortingTheSet x;

    @Before
    public void setUp() throws Exception {
        x = new SortingTheSet();
    }

    @After
    public void tearDown() throws Exception {
        x = null;
    }

    @Test
    public void sanityCheck() {
        Set<String> names = new TreeSet<>();
        names.add("Harry");
        names.add("Olive");
        names.add("Alice");
        names.add("Bluto");
        names.add("Eugene");

        List<String> ExpectedAnswer = new LinkedList<>(names);
        List<String> ActualAnswer = x.sortnames(names);

        Assert.assertEquals(ExpectedAnswer, ActualAnswer);

    }
}
