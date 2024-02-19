package jumble;

public class ArraySum {
    public int[] sumArrays(int[] array1, int[] array2) {
        int length = Math.max(array1.length, array2.length);
        int[] sumArray = new int[length];
        for (int i = 0; i < length; i++) {
            int val1 = (i < array1.length) ? array1[i] : 0;
            int val2 = (i < array2.length) ? array2[i] : 0;
            sumArray[i] = val1 + val2;
        }
        return sumArray;
    }
}
