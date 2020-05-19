package isbntools;

import jdk.jfr.StackTrace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void checkAValidISBN() {
        ValidateIsbn validator = new ValidateIsbn();
        boolean result =  validator.checkISBN(984782850);
        assertTrue(result);
    }


}
