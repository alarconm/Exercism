import java.util.HashMap;
import java.util.Map;

public class ParallelLetterFrequency {

    private Map<Integer, Integer> letterCount = new HashMap<>();

    ParallelLetterFrequency(String input) {
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
    }

    public Map<Integer, Integer> letterCounts() {
        return letterCount;
    }

}
