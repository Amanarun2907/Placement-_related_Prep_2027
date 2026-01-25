public class Backtracking_on_the_arrays {
    public static void changedArr(int arr[], int i,int value)
    {
      // base case 
      if(i==arr.length){
         printarr(arr);
         return;
      }
      // recursion 
      arr[i]= value;
      changedArr(arr, i+1, value+1); // function call step 
      arr[i] = arr[i]-2; // backtracking step  
       // arr is called by call by reference not value
    }
    public static void printarr(int arr[]){
         for (int i = 0;i<arr.length;i++)
         {
            System.out.print(arr[i]+" ");
         }
         System.out.println("");
    }
 public static void main(String[] args) {
    // System.out.println("backtracking in an array ");
    int arr[] = new int [5]; 
    // changedArr(arr, 0, 1);
    printarr(arr);
    changedArr(arr, 0,1 );
    printarr(arr);

 }
}
// Time complexity is O(n)............................
// recursion with backtracking 
// Function is printing  me the array after commiting all the changes . 
// Always remember that Array is called in a function by reference . 
