package Assignment_1;

public class Lab003 {
    public static void main(String[] args) {
        int a = 3000;
        int b = 20000;
        int c = 10000;
        int max1 = (a > b) && (a > c) ? a : ((b > c) ? b : c);
        System.out.println("Maximum number is = " + max1);
        //System.out.println ("post inc = " + b);
        //System.out.println(c);

    }
}
