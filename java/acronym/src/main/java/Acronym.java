class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {

        char[] phraseCharArray = phrase.toCharArray();
        StringBuilder acronym = new StringBuilder();
        acronym.append(phraseCharArray[0]);

        for (int i = 0; i < phraseCharArray.length; i++) {

            if (!Character.isLetter(phraseCharArray[i])
                    && Character.isLetter(phraseCharArray[i+1])) {

               acronym.append(phraseCharArray[i+1]);
            }
        }

        return acronym.toString().toUpperCase();
    }

}
