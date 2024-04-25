package Assignment_23_Apr;

import java.util.Scanner;

// Program to check the maximum out of 3 numbers entered by user

public class Max3 {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in); // Entry of 3 numbers by user
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        // get the maximum out of numbers 1,2 & 3 through use of ternary operator
        // used && operator to check multiple conditions
        int max = (num1 > num2) && (num1 > num3) ? (num1) : ((num2 > num3) && (num2 > num1) ? num2 : num3);
        System.out.println("the largest of the 3 numbers is \n"  +max);
    }
}

