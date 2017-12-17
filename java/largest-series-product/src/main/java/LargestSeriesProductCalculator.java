class LargestSeriesProductCalculator {

    private int[] input;
    private int inputLength;

    LargestSeriesProductCalculator(String inputNumber) {
        this.inputLength = inputNumber.length();
        int[] inputArray = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            inputArray[i] = Character.getNumericValue(inputNumber.charAt(i));
        }

        this.input = inputArray;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {

        long highestProduct = 0;
        int length = inputLength - numberOfDigits;

        for (int i = 0; i < length; i++) {
            int temp = 1;

            for(int j = 0; j < numberOfDigits; j++) {
                temp *= input[j + i];
            }

            if (temp > highestProduct) {
                highestProduct = temp;
            }

        }

        return highestProduct;
    }
}
