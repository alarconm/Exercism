class CollatzCalculator {

    int counter = 0;

    int computeStepCount(int start) {

        if (start < 1) {
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }

        //base case is 1, we will always end here
        if (start == 1) {
            return counter;
        }

        counter++; // if we get here we will be calling one of two recursive options, so we add one to counter

        if (start % 2 == 0) {
            return computeStepCount(start / 2);
        } else {
            return computeStepCount(3*start + 1);
        }
    }

}
