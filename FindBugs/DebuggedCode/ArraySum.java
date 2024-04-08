public class ArraySum {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        int[] sum = findSum(array1, array2);
        
        System.out.println("Sum of the two arrays:");
        for (int num : sum) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] findSum(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }
        
        int n = array1.length;
        int[] sum = new int[n];
        
        for (int i = 0; i < n; i++) {
            sum[i] = array1[i] + array2[i];
        }
        
        return sum;
    }
}