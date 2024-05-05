package Array_Assignment_1;

public class Max_salary {
    public static void main(String[] args) {
        int sal[] = { 30, 50, 60, 90, 10, 100, 999} ; // Sample Array
        int max = sal[0] ;   // assigning 1st value of array to max for comparing against all in a for loop
        for (int i = 0; i < sal.length; i++)
        {
           if (max < sal[i])   //checking max value and assigning after getting it
           {
               max = sal[i] ;
           }
        }
        System.out.println("Max. Salary is "+ max);
    }

}
