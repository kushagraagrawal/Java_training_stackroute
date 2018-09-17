import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentMarksCheck {

    StudentMarks p;

    @Before
    public void setUp() throws Exception {
        p = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }


    @Test
    public void CheckStudentGrades() {
        int[] gradesofstudents = {30,40,1000, 400};
        String successOrFail = p.checkGrades(gradesofstudents);
        String answer = "exception found";
        Assert.assertEquals(successOrFail, answer);
    }
    @Test
    public void PassStudentGrades() {
        int[] gradesofstudents = {30,40,10, 40};
        String successOrFail = p.checkGrades(gradesofstudents);
        String answer = "All Grades are Valid";
        Assert.assertEquals(successOrFail, answer);
    }
}
