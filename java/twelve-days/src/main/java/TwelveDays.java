import java.util.HashMap;

class TwelveDays {


    String verse(int verseNumber) {

        String intro = "On the " + day(verseNumber) + " day of Christmas my true love gave to me,";
        String[] verseReverse = (" twelve Drummers Drumming, eleven Pipers Piping," +
                " ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming," +
                " six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves," +
                " and a Partridge in a Pear Tree.\n").split(",");

        if(verseNumber == 1) {
            return intro + " a Partridge in a Pear Tree.\n";
        }

        String[] verse = new String[12];

        for (int i = 0; i < verseReverse.length; i++ ) {
            verse[i] = verseReverse[(verseReverse.length - 1) - i];
        }

        StringBuilder finalVerse = new StringBuilder();

        for(int i = verseNumber -1; i >= 0; i--) {
            if(i > 0) {
                finalVerse.append(verse[i] + ",");
            } else {
                finalVerse.append(verse[i]);
            }
        }

        return intro + finalVerse;
    }

    String day(int dayNumber) {

        HashMap<Integer, String> day = new HashMap<>();
        day.put(1, "first");
        day.put(2, "second");
        day.put(3, "third");
        day.put(4, "fourth");
        day.put(5, "fifth");
        day.put(6, "sixth");
        day.put(7, "seventh");
        day.put(8, "eighth");
        day.put(9, "ninth");
        day.put(10, "tenth");
        day.put(11, "eleventh");
        day.put(12, "twelfth");

        return day.get(dayNumber);
    }


    String verses(int startVerse, int endVerse) {

        StringBuilder multipleVerses = new StringBuilder();

        for (int i = startVerse; i <= endVerse; i++) {
            if(i < endVerse) {
                multipleVerses.append(verse(i) + "\n");
            } else {
                multipleVerses.append(verse(i));
            }

        }

        return multipleVerses.toString();
    }
    
    String sing() {
        StringBuilder wholeSong = new StringBuilder();

        for (int i = 1; i < 13; i++) {

            if (i < 12) {
                wholeSong.append(verse(i) + "\n");
            } else {
                wholeSong.append(verse(i));
            }

        }

        return wholeSong.toString();
    }
}
