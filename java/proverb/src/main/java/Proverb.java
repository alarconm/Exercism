class Proverb {

<<<<<<< HEAD
    Proverb(String[] words) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String recite() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

=======
    private String[] words;

    Proverb(String[] words) {

        this.words = words;
    }

    String recite() {

        if(words.length < 1) {
            return "";
        }

        String lastLine = "And all for the want of a " + words[0] + ".";
        StringBuilder proverb = new StringBuilder();

        if (words.length == 1) {
            return lastLine;
        } else {
            for (int i = 0; i < words.length - 1; i++) {
                proverb.append("For want of a " + words[i] + " the " + words[i + 1] +" was lost.\n");
            }

            proverb.append(lastLine);
        }

        return proverb.toString();
    }
>>>>>>> f7fa7f55173b0c3bed3276de0c93c5e9808fc7bd
}
