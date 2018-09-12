import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Member_VariableTest {

    Member_Variable newMember;

    @Before
    public void setUp() throws Exception {
        newMember = new Member_Variable();
    }

    @After
    public void tearDown() throws Exception {
        newMember = null;
    }

    @Test
    public void member_variable() {
        String check = newMember.member_variable("Harry Potter", 30, (float) 2500.3);
        String answer = "Success";
        Assert.assertEquals(check, answer);


    }
}