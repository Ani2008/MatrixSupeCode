//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of the matrix");
//        int rows = sc.nextInt();
//        System.out.print("Enter the elements of the matrix");
//        int cols = sc.nextInt();
//        MatrixOperation matrixOperation = new MatrixOperation();
//        System.out.println();
//        int[][] matrix = matrixOperation.createMatrix(rows, cols);
//        matrixOperation.printMatrix(matrix);
//        System.out.println("Valorile maxime de pe fiecare linie:");
//        matrixOperation.findMaxElement(matrix);
//        System.out.println("Valorile minime de pe fiecare coloana");
//        matrixOperation.findMinElement(matrix);
        int rows = 5;
        int cols = 5;
        MatrixOperation matrixOperation = new MatrixOperation();
        int[][] matrix = matrixOperation.createMatrix(rows, cols);
        matrixOperation.printMatrix(matrix);

    }
}