package isbntools;

import jdk.jfr.StackTrace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void checkAValidISBN() {
        ValidateIsbn validator = new ValidateIsbn();
        boolean result =  validator.checkISBN("0984782850");
        assertTrue(result, "first value");
        result = validator.checkISBN("1849967202");
        assertTrue(result, "second value");
    }
    @Test
    public void checkInvalidISBN() {
        ValidateIsbn validator = new ValidateIsbn();
        boolean result =  validator.checkISBN("0984782857");
        assertFalse(result);
    }

    @Test
    public void nineDigitIsNotAllowed() {
        ValidateIsbn validator = new ValidateIsbn();
        assertThrows(NumberFormatException.class, () -> {
            validator.checkISBN("123456789");
        });
    }


}
