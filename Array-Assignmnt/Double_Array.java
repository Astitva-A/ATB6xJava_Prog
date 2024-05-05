package Array_Assignment_1;

import java.util.Scanner;

public class double_arr {
    public static void main(String[] args) {
        int arr[] = {30, 40, 50};
        System.out.println("The Array before getting double is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int arr2[] = new int[3] ;
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number you want to make it double");
        for(int i=0;i<arr.length;i++)
        {
           arr2[i] = (arr[i] * 2) ;
        }
        System.out.println("\nPrinting Double Array Elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
