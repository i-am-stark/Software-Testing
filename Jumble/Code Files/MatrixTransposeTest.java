package jumble;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MatrixTransposeTest {

    @Test
    public void testTranspose() {
        MatrixTranspose matrixTranspose = new MatrixTranspose();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedTranspose = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        
        int[][] transposeMatrix = matrixTranspose.transpose(matrix);
        
        assertArrayEquals(expectedTranspose, transposeMatrix);
    }

  
    @Test
    public void testTransposeWithSingleElementMatrix() {
        MatrixTranspose matrixTranspose = new MatrixTranspose();
        int[][] matrix = {{5}};
        int[][] expectedTranspose = {{5}};
        
        int[][] transposeMatrix = matrixTranspose.transpose(matrix);
        
        assertArrayEquals(expectedTranspose, transposeMatrix);
    }

    @Test
    public void testTransposeWithDifferentRowAndColumnLength() {
        MatrixTranspose matrixTranspose = new MatrixTranspose();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expectedTranspose = {{1, 4}, {2, 5}, {3, 6}};
        
        int[][] transposeMatrix = matrixTranspose.transpose(matrix);
        
        assertArrayEquals(expectedTranspose, transposeMatrix);
    }

    @Test
    public void testTransposeWithNegativeValues() {
        MatrixTranspose matrixTranspose = new MatrixTranspose();
        int[][] matrix = {{-1, -2}, {-3, -4}, {-5, -6}};
        int[][] expectedTranspose = {{-1, -3, -5}, {-2, -4, -6}};
        
        int[][] transposeMatrix = matrixTranspose.transpose(matrix);
        
        assertArrayEquals(expectedTranspose, transposeMatrix);
    }
}
