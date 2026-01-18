import java.util.*;
public class What_is_time_complexity {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);  
      System.out.println("enter the size of the array! ");
      int a = sc.nextInt(); //Size 
      int arr[] = new int[a]; // array creation 
      // array input 
      for (int i = 0; i<a;i++){
        arr[i] = sc.nextInt();
      }
      // original array output 
      System.out.println("so your array is");
      System.out.println();
      for (int i = 0; i<a;i++){
       System.out.print(arr[i]+" ");
      }
      System.out.println();
      int x =arr[0];
    for(int i = 0 ;i<a;i++){
       if(arr[i]>x){
        x =arr[i];
       }
    }
    System.out.println("the largest element of the array is: "+x); 
     for(int i = 0;i<a;i++){
        if(arr[i]==x){
            arr[i]=Integer.MIN_VALUE;
        }
     }
     int y =arr[0];
     for(int i = 0 ;i<a;i++){
        if(arr[i]>y){
         y =arr[i];
        }
     }
     System.out.println("the second largest element of the array is: "+y); 

    }
}
// amount of space and time taken up by an algorithm as function of input size .......
// not the actual time taken by the code to run 
// Linear search 
// if the array is unsorted then to find the largest as we increase the no of the number in the array our number of operations also increases.
// if the array is sorted then to find the largest as we increase the no of the number in the array our number of operations remain constant because we know that we always find array at last index .
// we also focus on worst case time complexity ..
