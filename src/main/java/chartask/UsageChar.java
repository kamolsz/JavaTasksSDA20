package chartask;

import java.util.Arrays;

public class UsageChar {

    public static void main(String[] args) {

//        Alphabet();
//        Alphabet2();
//        Alphabet3();
//        biggestLetterInTheWord("alfabet");

/*        String someWord = "Java jest fajna ";
        printTextInSeparateLines(someWord);*/


        /*System.out.println(litera);
        int value = (int) litera;
        System.out.println(value);*/

//        howManyLetterAppearedInWord("alfabet", 'a');

/*        wordIsAPalindrome("alfabet");
        wordIsAPalindrome("kajak");*/

//        textContains("Ala ma kota", "kot");


    }

    private static void textContains(String text1, String text2) {

        if (text1.contains(text2)) {
            System.out.println(" this sequence contains another");
        } else {
            System.out.println(" this sequence does not contains another");

        }
    }

    private static void wordIsAPalindrome(String text) {
        char[] wordArray = text.toCharArray();
        char[] reversWordArray = new char[wordArray.length];
        //Arrays.compare(wordArray, reversWordArray);
        // System.out.println(Arrays.compare(wordArray, reversWordArray));

        for (int i = 0; i < wordArray.length; i++) {
            reversWordArray[i] = wordArray[wordArray.length - 1 - i];

        }
        if (Arrays.compare(wordArray, reversWordArray) == 0) {
            System.out.println("word " + "\"" + text + "\" is a palindrome");
        } else {
            System.out.println("word " + "\"" + text + "\" is not a palindrome");
        }

    }

    private static void howManyLetterAppearedInWord(String text, char letter) {

        char[] wordArray = text.toCharArray();
        int howMany = 0;
        StringBuilder sB = new StringBuilder();

        for (char e : wordArray) {
            if (e == letter) {
                howMany++;
            }

        }
        sB.append("letter ").append("\"").append(letter).append("\"").append(" appears in the word ")
                .append("\"").append(text).append("\" ").append(howMany).append(" times.");

        System.out.println(sB.toString());

    }

    private static void biggestLetterInTheWord(String text) {

        String word = new String(text);


        char[] wordArray = word.toCharArray();
        int[] valuesOfLetters = new int[wordArray.length];


        for (int i = 0; i < wordArray.length; i++) {
            valuesOfLetters[i] = (int) wordArray[i];

        }
        for (int i = 0; i < valuesOfLetters.length; i++) {
            //System.out.print(valuesOfLetters[i] + " ");
        }
        // System.out.println();

        Arrays.sort(valuesOfLetters);
        for (int i = 0; i < valuesOfLetters.length; i++) {
            //System.out.print(valuesOfLetters[i] + " ");
        }
        System.out.println();
        int biggestLetter = valuesOfLetters[valuesOfLetters.length - 1];
        // System.out.println(biggestLetter);

        char letterWeLookedFor = (char) biggestLetter;
        System.out.println(" Biggest leter in this word is " + "\"" + letterWeLookedFor + "\"");

    }

    private static void printTextInSeparateLines(String text) {

        String word = new String(text);


        char[] wordArray = word.toCharArray();
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println(wordArray[i]);

        }
    }

    private static void Alphabet() {

        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('A' + i));
        }
    }

    private static void Alphabet2() {

        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('A' + i));
            i++;
        }
    }

    private static void Alphabet3() {

        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('Z' - i));
        }
    }
}
