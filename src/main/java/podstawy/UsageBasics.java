package podstawy;

public class UsageBasics {
    private static int a = 3;
    private static int b = -1;
    private static int c = 8;

    public static void main(String[] args) {
        System.out.println(biggestNumber(a,b,c));
        evenNumber(a);
        evenNumber(b);
        evenNumber(c);
        System.out.println();
        isGreaterThanZero(a);
        isGreaterThanZero(b);
        isGreaterThanZero(c);
    }

    public static int biggestNumber(int number1, int number2, int number3) {
        int max = number1;
        if (max < number2) {
            max = number2;
        }
        if (max < number3) {
            max = number3;
        }
        return max;
    }

    public static void evenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");

        } else {
            System.out.println("Number " + number + " is odd");
        }

    }

    public static void isGreaterThanZero(int number) {
        if (number < 0) {
            System.out.println("Number " + number + " is les then 0");
        }
        if (number == 0) {
            System.out.println("Number " + number + " is equal 0");
        }
        if (number > 0) {
            System.out.println("Number " + number + " is grater then 0");
        }
    }

}
