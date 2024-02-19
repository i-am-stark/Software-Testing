
package jumble;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MatrixAdditionTest {

    @Test
    public void testAddMatrices() {
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] expectedSum = {{6, 8}, {10, 12}};
        
        int[][] sumMatrix = matrixAddition.addMatrices(matrix1, matrix2);
        
        assertArrayEquals(expectedSum, sumMatrix);
    }

    @Test
    public void testAddMatricesWithSingleElementMatrix() {
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] matrix1 = {{5}};
        int[][] matrix2 = {{7}};
        int[][] expectedSum = {{12}};
        
        int[][] sumMatrix = matrixAddition.addMatrices(matrix1, matrix2);
        
        assertArrayEquals(expectedSum, sumMatrix);
    }

    @Test
    public void testAddMatricesWithAllPositiveValues() {
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] expectedSum = {{8, 10, 12}, {14, 16, 18}};
        
        int[][] sumMatrix = matrixAddition.addMatrices(matrix1, matrix2);
        
        assertArrayEquals(expectedSum, sumMatrix);
    }

    @Test
    public void testAddMatricesWithNegativeValues() {
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] matrix1 = {{1, -2}, {-3, 4}};
        int[][] matrix2 = {{-5, 6}, {7, -8}};
        int[][] expectedSum = {{-4, 4}, {4, -4}};
        
        int[][] sumMatrix = matrixAddition.addMatrices(matrix1, matrix2);
        
        assertArrayEquals(expectedSum, sumMatrix);
    }

    @Test
    public void testAddMatricesWithZeroValues() {
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] matrix1 = {{0, 0}, {0, 0}};
        int[][] matrix2 = {{0, 0}, {0, 0}};
        int[][] expectedSum = {{0, 0}, {0, 0}};
        
        int[][] sumMatrix = matrixAddition.addMatrices(matrix1, matrix2);
        
        assertArrayEquals(expectedSum, sumMatrix);
    }
}
