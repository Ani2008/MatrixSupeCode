import java.util.Scanner;
public class MatrixOperation {
//    public int[][] createMatrix(int rows, int cols) {
//        Scanner sc = new Scanner(System.in);
//        int[][] matrix = new int[rows][cols];
//        System.out.println("Enter the elements of the matrix:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        return matrix;
//    }
//    public void printMatrix(int[][] matrix) {
//        System.out.println("Matrix is:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public void findMaxElement(int[][] matrix) {
//        for (int[] row : matrix) {
//            int max = row[0];
//            for(int col : row) {
//                if (max < col) {
//                    max = col;
//                }
//
//            }
//            System.out.println(max);
//        }
//    }
//    public void findMinElement(int[][] matrix) {
//        int m = matrix.length;
//        for(int j = 0; j < m; j++) {
//            int min = matrix[0][j];
//            for(int[] init : matrix) {
//                if(min > init[j]) {
//                    min = init[j];
//                }
//
//            }
//            System.out.println(min);
//        }
//    }
    public int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (i + j) % cols;
            }
        }
        return matrix;
    }
    public void printMatrix(int[][] matrix) {
        System.out.println("Matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
