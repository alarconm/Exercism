import java.util.HashMap;

public class WordCount {

    public HashMap<String, Integer> phrase(String phrase) {

        HashMap<String, Integer> wordCount = new HashMap<>();
        phrase = phrase.replaceAll("[!&@$%^.]+", "").toLowerCase();
        String[] words = phrase.split("[ ,:\n]+");

        for (String word : words) {
            word = word.replaceAll("^'|'$", "");

            if (!word.isEmpty()) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }
        return wordCount;
    }
}
