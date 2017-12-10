import java.util.ArrayList;
import java.util.List;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        ArrayList<Integer> isbn = new ArrayList<>();

        if(stringToVerify.length() > 13) {
            return false;
        }

        for(int i = 0; i < stringToVerify.length(); i++) {
            if (stringToVerify.charAt(i) != '-' && Character.getNumericValue(stringToVerify.charAt(i)) < 10) {
                isbn.add(Character.getNumericValue(stringToVerify.charAt(i)));
            }
        }
        if (stringToVerify.charAt(stringToVerify.length()-1) == 'X' ) {
            isbn.add(10);
        }

        if (isbn.size() != 10) {
            return false;
        }

        if ((isbn.get(0) * 10 + isbn.get(1) * 9 + isbn.get(2) * 8 + isbn.get(3) * 7 + isbn.get(4) * 6 + isbn.get(5) * 5
                + isbn.get(6) * 4 + isbn.get(7) * 3 + isbn.get(8) * 2 + isbn.get(9)) % 11 == 0) {
            return true;
        }

        return false;
    }

}
