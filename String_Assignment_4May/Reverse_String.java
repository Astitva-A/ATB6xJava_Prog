package May_2024_Java.Str_Assignment_4May;

import javax.print.event.PrintEvent;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter String");
        String str = sc.nextLine()  ;
        System.out.println("Entered String is " + str);
        String Reverse = "" ;
        for (int i = str.length()-1 ; i >= 0 ; i--)
        {
                Reverse = Reverse + str.charAt(i) ;
        }
        System.out.println("Reverse String is : " + Reverse);
        if (str.equalsIgnoreCase(Reverse))
        {
            System.out.println("The String is a PALINDROME");
        }
        else System.out.println("The String is NOT a PALINDROME");
    }
}
