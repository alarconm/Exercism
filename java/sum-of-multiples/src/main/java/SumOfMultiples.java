class SumOfMultiples {

    private int sum;

    SumOfMultiples(int number, int[] set) {

        for(int i = 1; i <= number; i++) {
            if(i % set[0] == 0 || i % set[1] == 0) {
                this.sum += i;
            }
        }

    }

    int getSum() {
        return this.sum;
    }

}
