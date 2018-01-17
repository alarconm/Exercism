import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneNumber {

   private List<Character> digits = new ArrayList<>();

    PhoneNumber(String number) {

        List<Character> approvedChars = Arrays.asList(' ', '(', ')', '-', '.');

        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                digits.add(number.charAt(i));
            } else {
                if (!approvedChars.contains(number.charAt(i))) { //check that the character is in approved list
                    throw new IllegalArgumentException("Illegal character in phone number." +
                            " Only digits, spaces, parentheses, hyphens or dots accepted.");
                }
            }
        }

        if (digits.size() < 10 || digits.size() > 11) {
            throw new IllegalArgumentException("Number must be 10 or 11 digits");
        }

        if (digits.size() == 11) {
            if (digits.get(0) != '1') {
                throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");
            } else {
                digits.remove(0); //1 is allowed but needs to be removed for the clean number
            }
        }
    }

    public String getNumber() {

        StringBuilder cleanNumber = new StringBuilder();

        for (char digit : digits) {
            cleanNumber.append(digit);
        }
        return cleanNumber.toString();
    }
}
