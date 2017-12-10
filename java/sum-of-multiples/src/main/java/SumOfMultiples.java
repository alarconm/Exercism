class SumOfMultiples {

    private int sum;

    SumOfMultiples(int number, int[] set) {

        for(int i = 1; i < number; i++) {

            for(int k = 0; k < set.length; k++) {

                if (i % set[k] == 0) {
                    this.sum += i;
                    break; //if it is a multiple of ANY of the set add it just once, then move to the next number
                }
            }
        }
    }

    int getSum() {
        return this.sum;
    }

}
