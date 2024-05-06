package Multi_Dim_Array_Assignments;

public class Max_MultiDim_Array {
    public static void main(String[] args) {
        System.out.println("Entered Array is :-");
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }System.out.println("\nThe Maximum element of the array is : "+ max);

    }

}
