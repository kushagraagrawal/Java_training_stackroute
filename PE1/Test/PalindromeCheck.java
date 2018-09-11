import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class PalindromeCheck {

    Palindrome checkifpalindrome;

    @Before
    public void setUp() throws Exception{
        checkifpalindrome = new Palindrome();
    }

    @Test
    public void notaPalindromeCheck() {
       // Palindrome checkifpalindrome = new Palindrome();

        String testcase1 = checkifpalindrome.palindrome(12345);

        String answer1 = 12345 + "is not a palindrome";

        Assert.assertEquals(testcase1, answer1);

    }

    @Test
    public void isaPalindromeCheck() throws Exception {
       // Palindrome checkifpalindrome = new Palindrome();
        String testcase2 = checkifpalindrome.palindrome(12345654321L);
        String answer2 = 12345654321L + "is a palindrom and sum of even numbers is less than 25";
        Assert.assertEquals(testcase2,answer2);
    }

    @Test
    public void anotherPalindromeCheck() throws Exception {
       // Palindrome checkifpalindrome = new Palindrome();
        String testcase3 = checkifpalindrome.palindrome(2468642);
        String answer3 = 2468642 + "is a palindrome and sum of even numbers is greater than 25";
        Assert.assertEquals(testcase3,answer3);
    }

    @After
    public void tearDown(){

        checkifpalindrome = null;
    }
}
