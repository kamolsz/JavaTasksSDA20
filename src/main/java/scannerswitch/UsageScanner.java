package scannerswitch;

import java.util.Scanner;

public class UsageScanner {

    public static void main(String[] args) {

//        naturalNumbers();

        rectangleArea();
    }

    private static void rectangleArea() {
        Scanner sc = new Scanner(System.in);
        int rectangleSideA = 0;
        int rectangleSideB = 0;

        System.out.println("Podaj bok \"a\" prostokąta");

        rectangleSideA = sc.nextInt();

        System.out.println("Podaj bok \"b\" prostokąta");

        rectangleSideB = sc.nextInt();

        int rectangleArea = rectangleSideA * rectangleSideB;

        System.out.println("Pole wynosi " + rectangleArea);

    }

    private static void naturalNumbers() {

        Scanner sc = new Scanner(System.in);
        int userNumber = 0;

        System.out.println("Podaj liczbę ");
        userNumber = sc.nextInt();
        printNumbers(userNumber);
    }


    private static void printNumbers(int endNumber) {

        for (int i = 1; i < endNumber; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
}
