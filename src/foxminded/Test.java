package foxminded;

public class Test {
    public static void main(String[] args) {

        String inputString = "Hello world!";

        System.out.println(reverseString(inputString));
    }

    public static String reverseString(String inputString) {
        if (inputString == null) {
            return null;
        }

        String leftPart;
        String rightPart;

        int length = inputString.length();

        // end recurse
        if (length <= 1) {
            return inputString;
        }

        leftPart = inputString.substring(0, length / 2);
        rightPart = inputString.substring(length / 2, length);

        // reverse right to left string
        return reverseString(rightPart) + reverseString(leftPart);

    }
}
