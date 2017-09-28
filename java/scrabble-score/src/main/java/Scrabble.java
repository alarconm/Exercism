class Scrabble {

    private String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {

        char[] wordArray = word.toCharArray();
        int score = 0;

        for (char c : wordArray) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'L'
                    || c == 'N' || c == 'R' || c == 'S' || c == 'T') {
                score += 1;
            } if (c == 'D' || c == 'G') {
                score += 2;
            } if (c == 'B' || c == 'C' || c == 'M' || c == 'P') {
                score += 3;
            } if (c == 'F' || c == 'H' || c == 'V' || c == 'W' || c == 'Y') {
                score += 4;
            } if (c == 'K') {
                score += 5;
            } if (c == 'J' || c == 'X') {
                score += 8;
            } if (c == 'Q' || c == 'Z') {
                score += 10;
            }
        }

        return score;
    }

}
