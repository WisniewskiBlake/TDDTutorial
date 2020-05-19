package isbntools;

public class ValidateIsbn {

    public boolean checkISBN(String isbn) {
        if(isbn.length() != 10) {
            throw new NumberFormatException("ISBN must be 10 digits long");
        }
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += isbn.charAt(i) * (10 - i);
        }
        if(total % 11 == 0) {
            return true;
        }
        else {
            return false;
        }
    }


}
