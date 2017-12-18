import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Sieve {

    private List<Integer> primes = new ArrayList<>();

    Sieve(int maxPrime) {

        if (maxPrime < 2) {
            throw new IllegalArgumentException("maxPrime can't be less than 2");
        }

        //Initial map holds true for each # 2 to maxPrime
        HashMap<Integer, Boolean> sieveMap = new HashMap<>();
        for (int i = 2; i <= maxPrime; i++) {
            sieveMap.put(i, true);
        }

        //Don't have to iterate through all of them, square root of maxPrime takes this to O(n log n)
        for (int i = 2; i <= Math.sqrt(maxPrime); i++) {

            if(sieveMap.get(i)) {
                for(int j = i+i; j <= maxPrime; j += i) {
                    sieveMap.replace(j, false);
                }
            }
        }

        for(int i = 2; i < sieveMap.size() + 2; i++) {
            if (sieveMap.get(i)) {
                this.primes.add(i);
            }
        }
    }

    List<Integer> getPrimes() {
        return this.primes;
    }
}
