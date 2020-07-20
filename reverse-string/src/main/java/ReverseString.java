
class ReverseString {

    int i;
    int j = 0;
    char[] letter;

    String reverse(String inputString) {

        if(inputString.isEmpty())
            return inputString;

        return reverse(inputString.substring(1)) + inputString.charAt(0);
    }
  
}
