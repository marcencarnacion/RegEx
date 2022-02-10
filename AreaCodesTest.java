import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCodesTest {
    //Testing the output to check if the first character contains a digit
    @Test
    void FirstNumTrue() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("9");
        assertTrue(tester1.getCode().matches("[0-9]"));
    }//end Test
    //Testing the output to check if it contains 2 numbers, nonspecific
    @Test
    void TwoNumsTrue() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("95");
        assertTrue(tester1.getCode().matches("[0-9][0-9]"));
    }//end Test
    //Testing the output to check if it contains 3 numbers
    @Test
    void ThreeNumsTrue() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("951");
        assertTrue(tester1.getCode().matches("[0-9][0-9][0-9]"));
    }//end Test
    //Testing the output to check if it contains 3 specific numbers
    @Test
    void SpecificThreeNumsTrue() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("951");
        assertTrue(tester1.getCode().matches("[9][5][1]"));
    }//end Test
    //Testing the output to validate if the user input a character
    @Test
    void NoNumsTrue() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("");
        assertTrue(tester1.getCode().matches(""));
    }//end Test
    //This test uses the Digit charcater class
    @Test
    void ThreeNumsCharacterTrue() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("951");
        assertTrue(tester1.getCode().matches("[\\p{Digit}]+[\\p{Digit}]+[\\p{Digit}]"));
    }//end Test
    //This test uses the Alum charcater class
    @Test
    void FirstNumCharacterTrue() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("9");
        assertTrue(tester1.getCode().matches("[\\p{Alnum}]"));
    }//end Test
    //If the user inputs a non-digit (invalid area code), then the test returns false
    @Test
    void NonCodeFalse() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("!!!");
        assertFalse(tester1.getCode().matches("[\\p{Digit}]"));
    }//end Test
    //If the user inputs a char, the test will return false because it only accepts digits
    @Test
    void EnterCharFalse() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("A");
        assertFalse(tester1.getCode().matches("[\\p{Digit}]"));
    }//end Test
    //If the user inputs a string, the test will return false because it only accepts digits
    @Test
    void EnterStringFalse() {
        AreaCodes tester1 = new AreaCodes();
        tester1.setCode("Abcdef");
        assertFalse(tester1.getCode().matches("[\\p{Digit}]"));
    }//end Test
    @Test
    void getCode() {
    }

    @Test
    void setCode() {
    }

    @Test
    void testToString() {
    }
}
