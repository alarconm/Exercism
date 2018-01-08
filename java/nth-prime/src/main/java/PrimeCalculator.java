<<<<<<< HEAD
class PrimeCalculator {

    int nth(int nth) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

=======
import java.util.ArrayList;

class PrimeCalculator {

    private ArrayList<Integer> numHolder = new ArrayList<>();

    int nth(int nth) {

        if (nth < 1) {
            throw new IllegalArgumentException("n can't be less than 1");
        }

        numHolder.add(2);
        int numCheck = 3;

        while (numHolder.size() < nth) {
            if (isPrime(numCheck)) {
                numHolder.add(numCheck);
            }
            numCheck++;
        }
        return numHolder.get(numHolder.size() -1);
    }

    boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
>>>>>>> c7fe0893c0060329c3aa6fd8ffc6ef2bf62c5e3e
}
