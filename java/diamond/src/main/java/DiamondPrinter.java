import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> diamondList = new ArrayList<>();

    List<String> printToList(char a) {

        int difference = (int) a - 65;
        String start = spaces(difference) + 'A' + spaces(difference);
        diamondList.add(start);

        for (int i = 1; i <= difference; i++) {
            diamondList.add(left((i), difference) + " " + "right");
        }
        diamondList.add(start);


        return diamondList;
    }

    String left(int num, int diff) {
        return spaces(diff - num) + (char)(65 + num) + spaces(diff - (num + 1));
    }










    String spaces(int num) {
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < num; i++) {
            space.append(" ");
        }
        return space.toString();
    }

}
