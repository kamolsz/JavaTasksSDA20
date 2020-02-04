package tasksOnDay5;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class Main {

    private static int[] generateTab(int size) {
        int[] tab = new int[size];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1000);
        }
        return tab;
    }


    public static void main(String[] args) {
        int[] a = generateTab(200000);
        int[] b = Arrays.copyOf(a, a.length);
        int[] c = Arrays.copyOf(a, a.length);

        long s1 = System.currentTimeMillis();
        Instant start = Instant.now();
        BubbleSort.bubbleSort(a);
        Instant stop = Instant.now();
        System.out.println(Duration.between(start, stop).getNano());
        long e1 = System.currentTimeMillis();
        System.out.println("Bubble sort time: " + (e1 - s1));

        long s2 = System.currentTimeMillis();
        MergeSort.mergeSortMethod(b);
        long e2 = System.currentTimeMillis();
        System.out.println("Merge sort time: " + (e2 - s2));

        long s3 = System.currentTimeMillis();
        QuickSort.quickSort(c);
        long e3 = System.currentTimeMillis();
        System.out.println("Quick sort time: " + (e3 - s3));

    }
}
