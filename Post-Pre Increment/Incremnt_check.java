package Assignment_1;

public class PostIncr {
    public static void main(String[] args) {
        int a = 10 ; // Increment expression check
        System.out.println(++a + a++ + a++);

        //++a --> Exp1 --> 11 ; a = 11
        // a++ --> Exp2 --> 11 ; a = 12
        // a++ --> Exp3 --> 12 ; a = 13  --> Exp 1 + Exp2 + Exp 3 = 11+11+12 = 24 (Ans)
        int b = 10; System.out.println(--b + b++ + ++b);
        // --b --> Exp1 --> 9 ; a = 9
        // b++ --> Exp2 --> 9 ; a = 10
        // ++b --> Exp3 --> 11 ; a = 11  --> Exp 1 + Exp2 + Exp 3 = 9+9+11 = 29 (Ans)
    }
}
