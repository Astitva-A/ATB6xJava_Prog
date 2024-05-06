package Assignment_23_Apr;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        System.out.println("Enter a Character");
       Scanner sc = new Scanner(System.in) ;
        char ch = sc.next(".").charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Entered character is a Vowel");
        }
        else {
            System.out.println("Entered Character is a Consonant");
        }
    }
}
