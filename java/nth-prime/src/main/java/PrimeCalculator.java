import java.util.ArrayList;

class PrimeCalculator {

    int nth(int nth) {

        ArrayList<Integer> numHolder = new ArrayList<>();

        if (nth < 1) {
            throw new IllegalArgumentException("n can't be less than 1");
        }

        numHolder.add(2);
        int numCheck = 3;
        while (numHolder.size() < nth) {

            for (int i = 0; i < numHolder.size(); i++) {
                if (numCheck % numHolder.get(i) == 0) {
                    numCheck++;
                    i = 0;
                }
            }
            numHolder.add(numCheck);
            numCheck++;
        }

        return numHolder.get(numHolder.size() -1);
    }
}
