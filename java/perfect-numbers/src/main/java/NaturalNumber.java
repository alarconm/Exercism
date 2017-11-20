class NaturalNumber {

    private Classification classification;

    public NaturalNumber(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        } else {
            this.classification = isItNatural(n);
        }
    }

    public Classification isItNatural(int n) {

        int sumOfFactors = 0;
        for (int i = 1; i < n; i++) {
            if ( n % i == 0) {
                sumOfFactors += i;
            }
        }

        if (sumOfFactors == n) {
            return Classification.PERFECT;

        } else if(sumOfFactors > n) {
            return Classification.ABUNDANT;

        } else {
            return Classification.DEFICIENT;
        }

    }

    public Classification getClassification() {
        return classification;
    }

}
