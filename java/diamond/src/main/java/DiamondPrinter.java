import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {

        List<String> diamondList = new ArrayList<String>();
        int lines = a - 64;

        for (int i = 0; i < lines; i++) {

            char nextChar = (char) (65 + i);
            String center = new String();

            if (i > 0) {
                center = new String(new char[i*2-1]).replace('\0',' ');
            }

            String affix = new String(new char[lines-i-1]).replace('\0',' ');
            String nextLine = affix + nextChar + center;

            if (i != 0) {
                nextLine += nextChar;
            }

            nextLine += affix;
            diamondList.add(nextLine);
        }

        if (lines > 1) {
            for (int i = 1; i < lines; i++) {
                diamondList.add(diamondList.get(lines - 1 - i));
            }
        }
        return diamondList;
    }
}