import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentGradesCheck {

    StudentGrades p;

    @Before
    public void setUp() throws Exception{
        p = new StudentGrades();

    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void BasicTest() {
        int Array_size = 4;
        int marks[] = {86, 65, 98, 77};
        float average = p.getAverage(marks);
        int min = p.getMinimum(marks);
        int max = p.getMaximum(marks);
        int realanswers[] = {min, max};
        int expectedanswers[] = { 65, 98};
        Assert.assertArrayEquals(realanswers, expectedanswers);
        System.out.println(average);
        Assert.assertEquals(average, (float) 81.50, 1e-8);

    }
}
