class ReverseString {
  
    String reverse(String string) {

        String reversedString = "";

        for(int i = (string.length()-1); i >= 0; i--) {
            reversedString += string.charAt(i);
        }

        return reversedString;

        //create new blank string
        //loop through old string starting at last char
        //each iteration add that char to the new string
        //return the string

    }
  
}