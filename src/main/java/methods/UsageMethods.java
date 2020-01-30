package methods;

public class UsageMethods {

    public static void main(String[] args) {

        System.out.println(multiply( 123,124));
        System.out.println(multiply2(123,0));
        System.out.println(power(2,0));
        System.out.println(howManyInStringChain("Wielkie dzieki", 'e'));
        System.out.println(contains("Alamakota", "mak"));
        System.out.println(contains("Alamakota", "tak"));
        System.out.println(concatenate("coś tam", "ktoś tam"));
    }


    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static String concatenate(String text1, String text2) {
        return text1 + text2;
    }

    private static int multiply2(int firstNumber, int secondNumber) {
        int multiply = 0;
        for (int i = 1; i <= secondNumber; i++) {
            multiply += firstNumber;
        }
        return multiply;
    }

    private static int power(int baseNumber, int powerNumber) {
        int pow = 1;
        for (int i = 1; i <= powerNumber; i++) {
            pow *= baseNumber;
        }
        return pow;
    }

    private static int howManyInStringChain(String text, char userChar) {

        char[] textToCharArray = text.toCharArray();
        int howMany = 0;
        for (char e : textToCharArray) {
            if (e == userChar) {
                howMany++;
            }
        }
        return howMany;

    }
    private static boolean contains ( String text1, String text2){

        return text1.contains(text2);
    }

}
