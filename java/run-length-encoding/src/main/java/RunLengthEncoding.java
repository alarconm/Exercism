import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RunLengthEncoding {

    HashMap<Character, Integer> codeHolder;

    RunLengthEncoding() {
        this.codeHolder = new LinkedHashMap<>();
    }

    public String encode(String code) {

        StringBuilder encoded = new StringBuilder();
        int counter = 1;

        for (int i = 0; i < code.length() -1; i++) {

            if (code.charAt(i) != code.charAt(i + 1)) {
                if (counter > 1) {
                    encoded.append(counter);
                }

                encoded.append(code.charAt(i));
                counter = 1;

                if (i == code.length() -2) {
                    encoded.append(code.charAt(i + 1));
                }
            } else {

                counter++;
                if (i == code.length() -2) {
                    if (counter > 1) {
                        encoded.append(counter);
                    }
                    encoded.append(code.charAt(i + 1));
                }
            }
        }

//        for (int i = 0; i < code.length(); i++) {
//            if (codeHolder.containsKey(code.charAt(i))) {
//                codeHolder.put(code.charAt(i), codeHolder.get(code.charAt(i)) + 1);
//            } else {
//                codeHolder.put(code.charAt(i), 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> entry : codeHolder.entrySet()) {
//            if (entry.getValue() > 1) {
//                encoded.append(entry.getValue());
//            }
//            encoded.append(entry.getKey());
//        }
        return encoded.toString();
    }

    public String decode(String decode) {
        return "";
    }

}
