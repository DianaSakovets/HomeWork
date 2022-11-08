package homework4.task5;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Matrix {
    public static Scanner in = new Scanner(System.in);
    public static int row1;
    public static int column1;
    public static int row2;
    public static int column2;
    public static int[][] matrix;
    public static int[][] multipliedMatrix;


    public static void main(String[] args) {
        int[][] matrix1 = enterMatrix1();
        int[][] matrix2 = enterMatrix2();
        int[][] resultMatrix = multiply(matrix1, matrix2);
        for (int[] ints : resultMatrix) {
            System.out.println(Arrays.toString(ints));
        }
        try {
            in.close();
        } catch (NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public static int[][] enterMatrix1() throws IllegalStateException, NoSuchElementException {
        System.out.println("Enter amount of rows in First Matrix");
        row1 = in.nextInt();
        System.out.println("Enter amount of columns in First Matrix");
        column1 = in.nextInt();
        System.out.println("Write digits in a First matrix");
        int[][] matrix = new int[row1][column1];
        try {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    if (in.hasNextInt()) {
                        matrix[i][j] = in.nextInt();
                    } else {
                        System.out.println("You didn't enter digit. Please, write only digits in matrix");
                        in.next();
                    }
                }
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println("Error" + e.getMessage());
        }
        return matrix;
    }

    public static int[][] enterMatrix2() throws IllegalStateException, NoSuchElementException {
        System.out.println("Enter amount of rows in a Second Matrix");
        row2 = in.nextInt();
        System.out.println("Enter amount of columns a Second Matrix");
        column2 = in.nextInt();
        System.out.println("Write digits in a Second matrix");
        int[][] matrix = new int[row2][column2];
        try {
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    if (in.hasNextInt()) {
                        matrix[i][j] = in.nextInt();
                    } else {
                        System.out.println("You didn't enter digit. Please, write only digits in matrix");
                        in.next();
                    }
                }
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println("Error" + e.getMessage());
        }
        return matrix;
    }


    public static int[][] multiply(int[][] matrix1, int[][] matrix2) throws ArithmeticException {
        int[][] multipliedMatrix = new int[row1][column2];
        try {
            if (row2 != column1) {
                throw new ArithmeticException("You can't multiply these matrices");
            } else {
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < column2; j++) {
                        for (int k = 0; k < column1; k++) {
                                multipliedMatrix[i][j] += matrix1[i][k] * matrix2[k][j];

                        }
                    }
                }
            }
        } catch (ArithmeticException e) {
            System.err.println("Exception" + e.getMessage());
        }
        return multipliedMatrix;
    }

}

