import java.util.ArrayList;
import java.util.List;

class Sieve {

    private List<Integer> primes = new ArrayList<>();

    Sieve(int maxPrime) {

        if (maxPrime < 2) {
            throw new IllegalArgumentException("maxPrime can't be less than 2");
        }

        //Initial array holds true for each # 2 to maxPrime
        ArrayList<Boolean> sieveArray = new ArrayList<>();
        for (int i = 2; i <= maxPrime; i++) {
            sieveArray.add(true);
        }

        for (int i = 2; i <= maxPrime; i++) {

            int counter = 1;
            if(sieveArray.get(i)) {
                for(int j = i*i; j <=maxPrime; j += counter*i) {
                    sieveArray.set(j, false);
                    counter++;
                }
            }
        }
        System.out.println(this.primes);
    }

    List<Integer> getPrimes() {

        List<Integer> primesResult;

        return this.primes;
    }
}
