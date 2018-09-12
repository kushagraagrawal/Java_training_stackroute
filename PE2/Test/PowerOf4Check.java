import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerOf4Check {

    PowerOf4 p;

    @Before
    public void setUp() throws Exception {
        p = new PowerOf4();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void BasicTest() {
        boolean check = p.checkIfPowerOf4(64);
        boolean answer = true;
        Assert.assertEquals(check, answer);
    }

    @Test
    public void LongNumberTest() {
        boolean check = p.checkIfPowerOf4(444189L);
        boolean answer = false;
        Assert.assertEquals(check, answer);
    }
    @Test
    public void LongPowerOf4(){
        boolean check = p.checkIfPowerOf4(1048576);
        boolean answer = true;
        Assert.assertEquals(check, answer);
    }
}
