class RotationalCipher {

    private String rotKey; //new key produced with alphabet rotated by shiftKey
    private String key; //original alphabet key

    RotationalCipher(int shiftKey) {

        StringBuilder rotKey = new StringBuilder();
        this.key = "abcdefghijklmnopqrstuvwxyz";

        //shift each letter in the key by the shiftKey
        for (int i = 0; i < key.length(); i++) {
            rotKey.append(key.charAt((i + shiftKey) % 26));
        }

        this.rotKey = rotKey.toString();
    }

    String rotate(String data) {

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {

            if (Character.isLetter(data.charAt(i))) {

                //maintain the case sensitivity by turning uppercase to lower, rotating then changing back to upper
                if (Character.isUpperCase(data.charAt(i))) {
                    int indexRot = key.indexOf(Character.toLowerCase(data.charAt(i)));
                    encrypted.append(Character.toUpperCase(rotKey.charAt(indexRot)));

                } else {
                    int indexRot = key.indexOf(data.charAt(i));
                    encrypted.append(rotKey.charAt(indexRot));
                }

            } else {
                encrypted.append(data.charAt(i));

            }

        }

        return encrypted.toString();
    }


}
