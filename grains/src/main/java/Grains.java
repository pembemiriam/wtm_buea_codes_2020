import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if((square < 1) || (square > 64)) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        } else if(square == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(2).pow(square-1);
        }

    }

    BigInteger grainsOnBoard() {
        BigInteger runningTotal = new BigInteger("0");
        for(int i = 1; i <= 64; i++) {
            runningTotal = runningTotal.add(grainsOnSquare(i));
        }

        return runningTotal;
    }


}
