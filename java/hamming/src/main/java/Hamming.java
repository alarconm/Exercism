public class Hamming {

    private String[] leftStrand;
    private String[] rightStrand;

    Hamming(String leftStrand, String rightStrand) {

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand.split("");
        this.rightStrand = rightStrand.split("");
    }

    int getHammingDistance() {

        int counter = 0;

        for (int i = 0; i <leftStrand.length; i++) {

            if (!leftStrand[i].equals(rightStrand[i])) {
                counter++;
            }
        }

        return counter;
    }

}
