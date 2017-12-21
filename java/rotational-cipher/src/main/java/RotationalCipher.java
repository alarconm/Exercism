class RotationalCipher {

    private String rotKey;
    private String key;

    RotationalCipher(int shiftKey) {

        StringBuilder rotKey = new StringBuilder();
        this.key = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < key.length(); i++) {
            rotKey.append(key.charAt((i + shiftKey) % 26));
        }

        this.rotKey = rotKey.toString();
    }

    String rotate(String data) {
        

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {

            if (data.charAt(i) != ' ') {
                int indexRot = key.indexOf(data.charAt(i));
                encrypted.append(rotKey.charAt(indexRot));
            } else {
                encrypted.append(' ');
            }
        }

        return encrypted.toString();
    }


}
