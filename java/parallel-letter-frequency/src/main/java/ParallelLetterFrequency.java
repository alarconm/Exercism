import java.util.HashMap;
import java.util.Map;

public class ParallelLetterFrequency {

    private Map<Integer, Integer> letterCount = new HashMap<>();
    private String input;

    ParallelLetterFrequency(String inputText) {
        this.input = inputText;
    }

    public Map<Integer, Integer> letterCounts() {
        for(int i = 0; i < input.length(); i++) {
            if(Character.isLetter(input.charAt(i))) {

                int currentLetter = (int) Character.toLowerCase(input.charAt(i));

                if(letterCount.containsKey(currentLetter)) {
                    letterCount.put(currentLetter, letterCount.get(currentLetter) + 1);
                } else {
                    letterCount.put(currentLetter, 1);
                }
            }
        }

        return letterCount;
    }

}
