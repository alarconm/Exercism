import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {

    private Map<Character, Integer> nucleotides = new HashMap<>();

    NucleotideCounter(String ncs) {
        nucleotides.put('A', 0);
        nucleotides.put('C', 0);
        nucleotides.put('G', 0);
        nucleotides.put('T', 0);

        for (int i = 0; i < ncs.length(); i++) {
            if (!nucleotides.containsKey(ncs.charAt(i))) {
                throw new IllegalArgumentException("this isn't a real choice!");
            }
            nucleotides.put(ncs.charAt(i), nucleotides.get(ncs.charAt(i)) + 1);
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        return nucleotides;
    }

    public int count(char single) {
        if (!nucleotides.containsKey(single)) {
            throw new IllegalArgumentException("this isn't a real choice!");
        }
        return nucleotides.get(single);
    }
}
