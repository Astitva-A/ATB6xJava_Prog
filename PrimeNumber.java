package Assignment_23_Apr;

import java.util.Scanner;

// Prime no.- A no. other than 1 divisible by only 1 and itself

public class Prime {
    public static void main(String[] args) {
        //System.out.println("Enter a Number");
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() ;
            if (num%2==0 && num==2)
            {
                System.out.println(num +" is a PRIME number");
            }
            else if (num ==1)
             {
                 System.out.println(num +" is NOT a PRIME number");
            } else if (num%2 != 0 && num >2)
            {
                System.out.println(num +" is a PRIME number");
            }

    }
}
