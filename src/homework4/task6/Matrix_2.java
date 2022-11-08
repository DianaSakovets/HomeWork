package homework4.task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\untitled7\\src\\homework4\\task6\\fileWithMatrix"));
        int row1 = 2;
        int column1 = 2;
        int[][] matrix1 = new int[row1][column1];
        while (input.hasNextInt()) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++)
                    matrix1[i][j] = input.nextInt();
            }

        }

        System.out.println("The first matrix is : ");
        for (int[] ints : matrix1) {
            System.out.println(Arrays.toString(ints));
        }

        Scanner input2 = new Scanner(new File("C:\\untitled7\\src\\homework4\\task6\\fileWithMatrix"));
        int row2 = 2;
        int column2 = 3;
        int[][] matrix2 = new int[row2][column2];
        while (input2.hasNext()) {
            if (input2.next().equals("Matrix")) {
                continue;
            } else {
                for (int i = 0; i < row2; i++) {
                    for (int j = 0; j < column2; j++) {
                        matrix2[i][j] = input2.nextInt();
                    }
                }
            }
        }
        System.out.println("The second matrix is : ");
        for (int[] ints : matrix2) {
            System.out.println(Arrays.toString(ints));
        }
    }
}



