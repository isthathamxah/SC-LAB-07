import java.util.Scanner;

public class Task2 {

    public static int[][] Matrix(Scanner sc, String name) {
        System.out.print("Enter number of rows for " + name + ": ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for " + name + ": ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(name + "[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }


    public static boolean isValidForMultiplication(int[][] A, int[][] B) {
        return A[0].length == B.length;
    }


    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];


        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }


    public static void printMatrix(int[][] matrix, String name) {
        System.out.println(name + " = ");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] A = Matrix(sc, "Matrix A");
        int[][] B = Matrix(sc, "Matrix B");


        if (!isValidForMultiplication(A, B)) {
            System.out.println("Error: Number of columns in Matrix A must equal number of rows in Matrix B!");
            sc.close();
            return;
        }

        int[][] result = multiplyMatrices(A, B);

        printMatrix(A, "Matrix A");
        printMatrix(B, "Matrix B");
        printMatrix(result, "Result (A x B)");

        sc.close();
    }
}
