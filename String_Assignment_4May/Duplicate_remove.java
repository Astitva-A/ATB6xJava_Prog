package May_2024_Java.Str_Assignment_4May;

import java.util.Scanner;

public class Duplicate_remove {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine() ;
        String result = "" ;

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (result.contains(ch))  // checks for duplicate character & Skips adding it
            {
                continue;   // skip
            }
            result += ch ;
        }
        System.out.println("The unique string is :" + result);
    }
}
