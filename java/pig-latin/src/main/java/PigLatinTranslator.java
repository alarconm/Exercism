import java.util.Arrays;

public class PigLatinTranslator {

    public String translate(String english) {

        StringBuilder pigLatin = new StringBuilder();
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String[] doubleVowels = {"yt", "xr"};
        String[] doubleConsonants = {"ch", "qu", "sq", "th", "thr", "sch", "squ"};
        String[] phrase = english.split(" ");

        if (phrase.length > 1) {
            StringBuilder phraseLatin = new StringBuilder();
            for (String word : phrase) {
                phraseLatin.append(translate(word));
                phraseLatin.append(" ");
            }
            phraseLatin.deleteCharAt(phraseLatin.length() - 1);
            return phraseLatin.toString();
        }

        if (Arrays.asList(vowels).contains(english.charAt(0)) ||
                Arrays.asList(doubleVowels).contains(english.substring(0, 2))) {
            pigLatin.append(english);
            pigLatin.append("ay");
            return pigLatin.toString();
        }

        if (Arrays.asList(doubleConsonants).contains(english.substring(0,3))) {
            pigLatin.append(english.substring(3));
            pigLatin.append(english.substring(0, 3));
            pigLatin.append("ay");
            return pigLatin.toString();
        }

        if (Arrays.asList(doubleConsonants).contains(english.substring(0, 2))) {
            pigLatin.append(english.substring(2));
            pigLatin.append(english.substring(0, 2));
            pigLatin.append("ay");
            return pigLatin.toString();
        }

        pigLatin.append(english.substring(1));
        pigLatin.append(english.charAt(0));
        pigLatin.append("ay");
        return pigLatin.toString();
    }
}
