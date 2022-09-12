package arrays;

import java.util.Scanner;

public class MatrixFigure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] matrix = new String[9][9];

        // matrix initialization
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i==j || matrix.length-i == j+1 || matrix.length-j == j+1 || matrix.length-i == i+1){
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }

        // matrix show
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }

            System.out.println(" ");
        }
    }
}
