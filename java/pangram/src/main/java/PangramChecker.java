public class PangramChecker {

    public boolean isPangram(String input) {

        if (input.equals("")) {
            return false;
        }

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k",
                "l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        input = input.toLowerCase();

        for (String letter : alphabet) {
            if (!input.contains(letter)) {
                return false;
            }
        }

        return true;
    }

}
