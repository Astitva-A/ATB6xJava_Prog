package Multi_Dim_Array_Assignments;

import java.util.Scanner;

public class Existing_element_Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered Array is :-");
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Enter element to be searched :-");
        int num = sc.nextInt();
        Boolean flag = false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == num) {
                    flag = true ;
                    break;
                }
            }
        } System.out.println("Element entered is found : " + flag) ;
    }
}
