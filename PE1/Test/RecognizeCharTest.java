import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecognizeCharTest {

    RecognizeChar p;

    @Before
    public void setUp() throws Exception {
        p = new RecognizeChar();
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void upperCaseCheck() {
        //Arrange
        String expectedValue = "upper case";
        //Act
        String result = p.recognizecharacter('S');
        //Assert
        assertEquals (expectedValue, result);
    }

    @Test
    public void lowerCaseCheck() {
        //Arrange
        String expectedValue = "lower case";
        //Act
        String result = p.recognizecharacter('d');
        //Assert
        assertEquals (expectedValue, result);
    }

    @Test
    public void digitCheck() {
        //Arrange
        String expectedValue = "Digit";
        //Act
        String result = p.recognizecharacter('6');
        //Assert
        assertEquals (expectedValue, result);
    }

    @Test
    public void specialCharacterCheck() {
        //Arrange
        String expectedValue = "Special Symbol";
        //Act
        String result = p.recognizecharacter('$');
        //Assert
        assertEquals (expectedValue, result);
    }
}