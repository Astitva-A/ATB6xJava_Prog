package Assignment_25_Apr_24;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Swtch {
    public static void main(String[] args) {
        System.out.println("Enter 1st Number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd Number");
        //Scanner sc1 = new Scanner(System.in) ;
        int num2 = sc.nextInt();

        System.out.println("Choose an operator : +, -, *, / or %");
        Scanner sc3 = new Scanner(System.in);
        char op = sc3.next().charAt(0);
        switch (op) {
            case '+':   //Performs Addition
                int result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':  //Performs Subtraction
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':  //Performs Multiplication
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':  //Performs Division
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            case '%':  //Calculates Remainder
                result = num1 % num2 ;
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
        sc.close();
    }
}
