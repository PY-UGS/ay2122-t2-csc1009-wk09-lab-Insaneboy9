import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomCharacterTest {

    @Test
    public void randomLowerCaseLetterTest() { //test case fo random lower case
        int lowerCaseAAsciiCode = 97;
        int lowerCaseZAsciiCode = 122;

        for (int i = 0; i < 15; i++) {
            char letter = RandomCharacter.getRandomLowerCaseLetter();
            assertTrue(letter >= lowerCaseAAsciiCode && letter <= lowerCaseZAsciiCode);
        }
    }

    @Test
    public void randomUpperCaseLetterTest() { //test case fo random upper case
        int upperCaseAAsciiCode = 65;
        int upperCaseZAsciiCode = 90;

        for (int i = 0; i < 15; i++) {

            char letter = RandomCharacter.getRandomUpperCaseLetter();

            assertTrue(letter >= upperCaseAAsciiCode && letter <= upperCaseZAsciiCode);
        }
    }

    @Test
    public void randomDigitCharacterTest() { //test case fo random digit character
        int digitCharacter0AsciiCode = 48;
        int digitCharacter9AsciiCode = 57;

        for (int i = 0; i < 15; i++) {

            char digit = RandomCharacter.getRandomDigitCharacter();

            assertTrue(digit >= digitCharacter0AsciiCode && digit <= digitCharacter9AsciiCode);
        }
    }


    @Test
    public void checkPrimeNumberTest() { //test if number is prime

        boolean checkPrime = true;

        char val = 3;

        boolean testFunction;

        testFunction = RandomCharacter.checkPrimeNumber(val);

        assertEquals(checkPrime, testFunction);
    }


    @Test
    public void randomCharacterTest() { //test case for random character

        for (int i = 0; i < 15; i++) {

            char testChar = RandomCharacter.getRandomCharacter();

            assertTrue(RandomCharacter.characterList.indexOf(testChar) != -1);
        }
    }
}