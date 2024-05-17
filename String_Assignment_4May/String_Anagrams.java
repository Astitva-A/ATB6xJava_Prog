package May_2024_Java.Str_Assignment_4May;

import java.util.Arrays;
import java.util.Scanner;

public class String_Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : "); // String Entry by user
        String s1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the second string : ");
        String s2 = sc.nextLine().toLowerCase();

        s1= s1.toLowerCase();  // Lower case conversion of string to help in comparison
        s2= s2.toLowerCase();

        if (s1.length() != s2.length()) {  // in case the lengths are not in sync --> Wrong entry msg.
            System.out.println("The Strings cannot be used to compare Anagram") ; }
        else {
            char string1[] = s1.toCharArray() ;  //Conversion of String to arrays & sorting
            char string2[] = s2.toCharArray() ;
            Arrays.sort(string1);
            Arrays.sort(string2);

            if (Arrays.equals(string1,string2) == true)  // Checking elements of String arrays are matching
            {
                System.out.println("Both Strings are Anagrams");
            }
            else {
                System.out.println("Both Strings are NOT Anagrams");
            }
        }
    }

}
