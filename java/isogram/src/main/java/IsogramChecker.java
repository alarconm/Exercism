import java.util.HashMap;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        HashMap<Character, Integer> charHolder = new HashMap<>();

        phrase = phrase.toLowerCase();

        for (int i = 0; i < phrase.length(); i++) {

            if (Character.isLetter(phrase.charAt(i))) {
                if (charHolder.containsKey(phrase.charAt(i))) {
                    return false;
                }
                else {
                    charHolder.put(phrase.charAt(i), 1);
                }
            }
        }
        return true;
    }

}
