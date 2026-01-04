import java.util.Arrays;
public class two_dimensional_array_in_memory{
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        Arrays.sort(arr);
        for (int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
//arrays are stored in continuous fashsion (1 dimensional array)
// row major order
// column major order 
// Not nessary that 2d array is stored in continuous fashion only in memory .