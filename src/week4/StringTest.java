package week4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static week4.Constants.*;

/**
 * Created by Lilia Shamirian on  28, Nov, 2020
 */
public class StringTest {
    private StringAPI api;

    @BeforeClass
    public void setUp() {
        api = new StringAPI();
    }

    //Ex1
    @Test
    public void getCharacterAtIndex() {
        String result;
        result = api.getIndexCharacter(null, 5);
        assert result.equals(OUT_OF_BOUND);

        result = api.getIndexCharacter("", 5);
        assert result.equals(OUT_OF_BOUND);

        result = api.getIndexCharacter("Lilia", 8);
        assert result.equals(OUT_OF_BOUND);

        result = api.getIndexCharacter("Lilia", -8);
        assert result.equals(OUT_OF_BOUND);

        String value = "Lilia";
        result = api.getIndexCharacter(value, 3);
        assert result.equals(String.valueOf(value.charAt(3)));
    }

    //Ex2
    @Test
    public void getWordCount() {
        int result;
        result = api.getWordCount(null);
        assert result == 0;

        result = api.getWordCount("");
        assert result == 0;

        result = api.getWordCount("Lilia");
        assert result == 0;

        result = api.getWordCount("Li li a");
        assert result == 3;
    }

    //Ex3
    @Test
    public void checkPalindrome() {
        String result;
        result = api.checkIfInputIsPalindrome("");
        assert result.equals(OUT_OF_BOUND);

        result = api.checkIfInputIsPalindrome(null);
        assert result.equals(OUT_OF_BOUND);

        result = api.checkIfInputIsPalindrome("madam");
        assert result.equals("Palindrome");

        result = api.checkIfInputIsPalindrome("Lilia");
        assert result.equals("Not Palindrome");
    }

    //Ex4
    public void checkBrackets() {
        String result;
        result = api.checkBrackets(null);
        assert result.equals(INVALID);

        result = api.checkBrackets("");
        assert result.equals(INVALID);

        result = api.checkBrackets("abcd");
        assert result.equals(INVALID);

        result = api.checkBrackets("(()))");
        assert result.equals(INVALID);

        result = api.checkBrackets("(())");
        assert result.equals(VALID);
    }

    //Ex5
    @Test
    public void isInputContains() {
        boolean result;
        result = api.isInputContains(null, "Hello");
        assert !result;

        result = api.isInputContains("", "Hello");
        assert !result;

        result = api.isInputContains("Hello", "");
        assert !result;

        result = api.isInputContains("Hello", null);
        assert !result;

        result = api.isInputContains("Hello World", "And");
        assert !result;

        result = api.isInputContains("Hello World", "llo Wo");
        assert result;
    }

    //Ex6
    @Test
    public void isInputStartWithAnother() {
        boolean result;
        result = api.isInputStartWithAnother("", "Hello");
        assert !result;

        result = api.isInputStartWithAnother(null, "Hello");
        assert !result;

        result = api.isInputStartWithAnother("Hello", "");
        assert !result;

        result = api.isInputStartWithAnother("Hello", null);
        assert !result;

        result = api.isInputStartWithAnother("Hello World", "World");
        assert !result;

        result = api.isInputStartWithAnother("Hello World", "Hello");
        assert result;
    }

    //Ex7
    @Test
    public void isInputEndWithAnother() {
        boolean result;
        result = api.isInputStartWithAnother("", "Hello");
        assert !result;

        result = api.isInputStartWithAnother(null, "Hello");
        assert !result;

        result = api.isInputStartWithAnother("Hello", "");
        assert !result;

        result = api.isInputStartWithAnother("Hello", null);
        assert !result;

        result = api.isInputStartWithAnother("Hello World", "Hello");
        assert !result;

        result = api.isInputStartWithAnother("Hello World", "World");
        assert result;
    }

    //Ex8
    @Test
    public void removeDuplicateChars() {
        String result;
        result = api.removeDuplicateChars("");
        assert result.equals(INVALID);

        result = api.removeDuplicateChars(null);
        assert result.equals(INVALID);

        result = api.removeDuplicateChars("null");
        assert result.equals("nul");

        result = api.removeDuplicateChars("Hi");
        assert result.equals("Hi");
    }

    //Ex9
    @Test
    public void divideString() {
        String[] result;
        result = api.divideString("", 2);
        assert result.equals(null);

        result = api.divideString(null, 2);
        assert result.equals(null);

        result = api.divideString("abcdefgh", -3);
        assert result.equals(null);

        result = api.divideString("abcdefgh", 10);
        assert result.equals(null);

        result = api.divideString("abcdefgh", 5);
        assert result.equals(null);

        result = api.divideString("abcdefgh", 4);
        assert result.equals("ab,cd,ef,gh");
        //how to check the array?
    }
}