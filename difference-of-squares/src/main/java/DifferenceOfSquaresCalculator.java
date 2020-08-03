class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sumNatur = 0;

        for (int i = 1; i <= input; i++)
            sumNatur += i;


        return sumNatur * sumNatur;    }

    int computeSumOfSquaresTo(int input) {
        int sumSquares = 0;

        for (int i = 1; i <= input; i++)
            sumSquares += (i * i);

        return sumSquares;    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
