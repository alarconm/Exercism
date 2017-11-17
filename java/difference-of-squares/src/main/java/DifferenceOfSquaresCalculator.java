public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int num) {

        int summedNumbers = 0;
        for (int i = 1; i <=num; i++) {
            summedNumbers += i;
        }

         int result = (int)Math.pow(summedNumbers, 2);

        return result;
    }

    public int computeSumOfSquaresTo(int num) {

        int squaredNumbers = 0;
        for (int i = 1; i <= num; i++ ) {
            squaredNumbers += (int)Math.pow(i, 2);
        }

        return squaredNumbers;
    }

    public int computeDifferenceOfSquares(int num) {

        return computeSquareOfSumTo(num) - computeSumOfSquaresTo(num);
    }
}
