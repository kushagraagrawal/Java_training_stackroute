import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UpdateandEmptyListCheck {

    UpdateandEmptyList c;

    @Before
    public void setUp() throws Exception {
        c = new UpdateandEmptyList();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void sanityCheck() {
        String[] initialString = {"Apple", "Grape", "Melon", "Berry"};
        List<String> actualString = new LinkedList<String>(Arrays.asList(initialString));
        actualString = c.replaceElements(actualString, "Apple", "Kiwi");
        actualString = c.replaceElements(actualString, "Melon","Mango");

        String[] expectedAnswer = {"Kiwi", "Grape", "Mango", "Berry"};
        List<String> expectedanswers = Arrays.asList(expectedAnswer);

        Assert.assertEquals(expectedanswers, actualString);


        int sizeoflist = c.emptyList(actualString);

        Assert.assertEquals(sizeoflist, 0);


    }


}
