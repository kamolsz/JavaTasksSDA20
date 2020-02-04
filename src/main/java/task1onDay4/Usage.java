package task1onDay4;

/*
 * metoda ma pobrać inta, przerobić na liczbę binarne i podac najwiekszą
 * liczbę wystapień 0 pod rząd pomiedzy jedynkami
 *
 * np int --> bin (100100001) zwraca 4 bo cztery zera pomiedzy jedynkami
 *
 * */

public class Usage {

    private static String binary(int a) {
        int decNumber = a;
        String binaryNumber = "";
        while (decNumber > 0) {
            binaryNumber = decNumber % 2 + binaryNumber;
            decNumber /= 2;
        }
        return binaryNumber;
    }

    private static int howMany(String binary) {

        char[] binaryChar = binary.toCharArray();
        int maxRep = 0;
        int counter = 0;
        for (int i = 0; i < binaryChar.length; i++) {
            if (binaryChar[i] == '1') {
                if (maxRep < counter) {
                    maxRep = counter;
                    counter = 0;
                }
            } else {
                counter++;
            }
        }
        return maxRep;
    }

    public static void main(String[] args) {
        System.out.println(binary(27));

    }


}
