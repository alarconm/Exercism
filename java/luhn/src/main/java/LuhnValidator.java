import java.util.ArrayList;
import java.util.Arrays;

class LuhnValidator {

    boolean isValid(String candidate) {

//        check size if 1 or less not valid
//        check for any non digit characters other than spaces, if any not valid
//        remove all spaces out of the string
//        convert string to numbers
//        loop through number backwards double every second number
//        if doubled number is greater than 9 then subtract 9 from it
//        add number to an integer with a running sum of all extracted digits
//        after loop is completed check the sum of all digits mod 10 and if it equals zero it is valid


        if (candidate.length() <= 1) {
            return false;
        }

        ArrayList<Integer> id = new ArrayList<>();

        for (int i = 0; i < candidate.length(); i++) {
            if (Character.isDigit(candidate.charAt(i))) {
                id.add(Character.getNumericValue(candidate.charAt(i)));

            } else if (candidate.charAt(i) != ' ') {
                return false;
            }
        }

        for (int i = id.size() - 2; i >= 0; i -= 2) {

                int temp = id.get(i) * 2;

                if (temp > 9) {
                    temp = temp - 9;
                }

                id.set(i, temp);
        }

        if (id.size() < 2) {
            return false;
        }

        int idSum = 0;
        for (int i : id) {
            idSum += i;
        }

        if (idSum % 10 == 0) {
            return true;
        }
        return false;
    }

}
