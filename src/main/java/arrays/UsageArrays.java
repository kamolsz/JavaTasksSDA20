package arrays;

public class UsageArrays {

    public static void main(String[] args) {
        int [] tabA = {2,4,6,8};
        int [] tabB = {1,3,5,7,9};
        printArray(tabA);
        printArray(tabB);
        System.out.println(getMax(tabA));
        System.out.println(getMin(tabB));

        int [] tabOfMaxMinAndSum = getMaxMinAndSum(tabB);
        printArray(tabOfMaxMinAndSum);

        int [] largerArray = getLarger(tabA, tabB);
        printArray(largerArray);

        int [] mergeArrays = merge(tabA,tabB);
        printArray(mergeArrays);


    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    private static int getMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int[] getMaxMinAndSum(int[] array) {
        int[] newArray = new int[3];
        newArray[0] = getMax(array);
        newArray[1] = getMin(array);
        newArray[2] = getSum(array);

        return newArray;
    }

    private static int[] getLarger(int[] array1, int[] array2) {
        int sumArray1 = getSum(array1);
        int sumArray2 = getSum(array2);
        return sumArray1 > sumArray2 ? array1 : array2;
    }

    private static int[] merge(int[] array1, int[] array2) {
        int[] mergeArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergeArray[i] = array1[i];

        }
        int iter = 0;
        for (int i = array1.length; i < mergeArray.length; i++) {

            mergeArray[i]=array2[iter];
            iter++;

        }
        return mergeArray;
    }
}
