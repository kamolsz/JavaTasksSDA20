package tasksOnDay5;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] x = {3, 6, 7, 2, 8, 1};
        bubbleSort(x);
        System.out.println(Arrays.toString(x));

    }
    /*
    podójna petla zeby przejsc przez wszystkie elementy
    3,6,7,2,8,1
    3,6,2,7,1,8
    3,2,6,1,7,8
    2,3,1,6,7,8
    2,1,3,6,7,8
    1,2,3,6,7,8
     */

    public static void bubbleSort(int[] x) {
        int temp = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] > x[j + 1]) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
    }
/*
za kazdą jedna petna na konc sortowania laduje najwieksza liczba
wiec mozna pominąc każdy kolejny ostatnii indeks
    3,6,7,2,8,1 <-wejsciowy
    3,6,2,7,1,8 <- i=0 , k=0
    3,2,6,1,7,8
    2,3,1,6,7,8
    2,1,3,6,7,8
    1,2,3,6,7,8
 */
    public static void bubbleSort2(int[] x) {
        int temp = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - i; j++) {
                if (x[j] > x[j + 1]) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
    }

    private static void swap(int a, int b) {
        System.out.println("a= " + a + ", b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
