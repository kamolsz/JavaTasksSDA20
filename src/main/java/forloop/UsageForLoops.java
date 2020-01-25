package forloop;

public class UsageForLoops {

    public static void main(String[] args) {
//        printnumbersInc(0, 50);
//        printnumbersInc(55, 150);
//        printnumbersDec(1, 100);
//        printEvenNumbers(1, 100);
//        numbersDivisible(0, 100);
//        sum (1,459);
        printTriangle2(5);
        printTriangle3(5);


    }

    public static void printnumbersInc(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            // System.out.print(i + " ");

            System.out.printf("%5s", i);

        }
        System.out.println();
    }

    public static void printnumbersDec(int startNumber, int endNumber) {
        for (int i = endNumber; i >= startNumber; i--) {
            // System.out.print(i + " ");

            System.out.printf("%5s", i);

        }
        System.out.println();
    }

    public static void printEvenNumbers(int startNumber, int endNumber) {

        for (int i = startNumber; i <= endNumber; i++) {

            if (i % 2 == 0) {
                System.out.printf("%5s", i);
            }
        }
    }

    public static void numbersDivisible(int startNumber, int endNumber) {

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.print(", is divisible by 2");
            }
            if (i % 3 == 0) {
                System.out.print(", is divisible by 3");
            }
            if (i % 5 == 0) {
                System.out.print(", is divisible by 5");
            }
            System.out.println();
        }

    }

    public static void sum(int startNumber, int endNumber) {
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void sumArithmetic(int startNumber, int endNumber) {
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i += 2) {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void printTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void printTriangle2(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void printTriangle3(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = number; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
