package May_JAVA_PROG.Multi_Dim_Array_Assignments;

import java.util.Scanner;

public class Transpose_2D_Array {
    public static void main(String[] args) {
        System.out.println("Entered Array is :-");
        int original[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int transpose[][] = new int[3][3];
        System.out.println("Original Matrix ");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix after Transpose");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                transpose[i][j] = original[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
