import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		List<Integer> numToIterate = new ArrayList<>();
		int sum = 0;
		int copy = numberToCheck;

		//if single digit no need to break the number into digits
		if (copy < 10) {
			numToIterate.add(copy);
		} else {
			//create the list of digits in the # given
			while (copy != 0) {
				int lastDigit = copy % 10;
				numToIterate.add(lastDigit);
				copy /= 10;
			}
		}



		//add each digit to the power of the size of the list of digits to the sum
		for (int i = 0; i < numToIterate.size(); i++) {
			sum += Math.pow(numToIterate.get(i), numToIterate.size());
		}

		if (sum == numberToCheck) {
			return true;
		}
		return false;
	}

}
