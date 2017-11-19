import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

         String binary = Integer.toBinaryString(number);
         ArrayList<Character> binaryArray = new ArrayList<>();
         List<Signal> result = new ArrayList<>();


         for(int i = 0; i < binary.length(); i++) {
             binaryArray.add(binary.charAt(i));
         }

         if (binaryArray.size() - 1 >= 0) {
             if ( binaryArray.get(binaryArray.size() - 1).equals('1')) {
                 result.add(Signal.WINK);
             }
         }
         if (binaryArray.size() - 2 >= 0) {
             if (binaryArray.get(binaryArray.size() - 2).equals('1')) {
                 result.add(Signal.DOUBLE_BLINK);
             }
         }
         if (binaryArray.size() - 3 >= 0) {
             if ( binaryArray.get(binaryArray.size() - 3).equals('1')) {
                 result.add(Signal.CLOSE_YOUR_EYES);
             }
         }
         if (binaryArray.size() - 4 >= 0) {
            if (binaryArray.get(binaryArray.size() - 4).equals('1')) {
                result.add(Signal.JUMP);
            }
         }
         if (binaryArray.size() - 5 >= 0) {
             if( binaryArray.get(binaryArray.size() - 5).equals('1')) {
                 Collections.reverse(result);
             }
         }

         return result;

    }

}
