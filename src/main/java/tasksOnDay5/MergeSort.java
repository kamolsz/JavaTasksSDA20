package tasksOnDay5;

import java.util.Arrays;


/*
dzielimy tablice na pojedyncze elementy i potem składamy
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] x = {3, 6, 7, 2, 8, 1};
        mergeSortMethod(x);
        System.out.println(Arrays.toString(x));

    }

    public static void mergeSortMethod(int[] x) {
        mergeSort(x, 0, x.length - 1);

    }
//rekurencyjne wywoływanie
    private static void mergeSort(int[] x, int start, int stop) {
        if (start < stop) {
            int middle = (start + stop) / 2;
            mergeSort(x, start, middle); //prawa strona
            mergeSort(x, middle + 1, stop); //pewa strona -> +1 jest zeby przesunac sie w indeksie
            merge(x,start,middle,stop);
        }
    }

    /*
    3, 6, 7 | 2, 8, 1
    i1        i2
    current
     */

    private static void merge(int[] x, int start, int middle, int stop) {
        int[] temporaryArrayFromX = Arrays.copyOf(x, x.length);
        int i1 =start;
        int i2 = middle+1;
        int current =start;
        while (i1<=middle && i2<=stop){
            if (temporaryArrayFromX[i1]<temporaryArrayFromX[i2]){
                x[current]=temporaryArrayFromX[i1];
                i1++;

            }else{
                x[current]=temporaryArrayFromX[i2];
                i2++;
            }
            current++;
        }
        while (i1<=middle){
            x[current]=temporaryArrayFromX[i1];
            i1++;
            current++;
        }
    }
}
