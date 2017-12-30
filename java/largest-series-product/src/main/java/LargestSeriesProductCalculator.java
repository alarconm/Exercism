class LargestSeriesProductCalculator {

    private long[] input;
    private int inputLength;

    LargestSeriesProductCalculator(String inputNumber) {

        if (inputNumber == null) {
            throw new IllegalArgumentException("String to search must be non-null.");
        }

        this.inputLength = inputNumber.length();
        long[] inputArray = new long[inputLength];

        for (int i = 0; i < inputLength; i++) {
            inputArray[i] = Character.getNumericValue(inputNumber.charAt(i));

            if (inputArray[i] > 9) {
                throw new IllegalArgumentException("String to search may only contain digits.");
            }
        }

        this.input = inputArray;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {

        if (numberOfDigits > inputLength) {
            throw new IllegalArgumentException(
                    "Series length must be less than or equal to the length of the string to search.");
        }
        if (numberOfDigits < 0 ) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        long highestProduct = 0;
        int length = inputLength - numberOfDigits;

        for (int i = 0; i <= length; i++) {
            long temp = 1;

            for (int j = 0; j < numberOfDigits; j++) {
                temp *= input[j + i];
            }

            if (temp > highestProduct) {
                highestProduct = temp;
            }

        }

        return highestProduct;
    }
}
