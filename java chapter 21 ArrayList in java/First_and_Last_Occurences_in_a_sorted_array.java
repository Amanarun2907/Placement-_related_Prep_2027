import java.util.*;
public class First_and_Last_Occurences_in_a_sorted_array {
    // Array is sorted and having the duplicate elements also 
    // you need to find the last and first ouccrences of the element 
    // apply binary search [Sorted and having the duplicate elements ]...
    public static ArrayList<Integer> occurences (int arr[] , int element ){
     //creating a arraylist that we have to return in the end 
     ArrayList<Integer> ans  = new ArrayList<>();
     int si = 0;
     int ei = arr.length-1;
     int fo = -1; // if element is not there return -1 ;
     int lo = -1; // if element is not there return -1 ;
     // first we are wrting the code of first occurence 
     while(si<=ei){
        int mid = si+(ei-si)/2;
        if(arr[mid]==element){
          fo = mid;
          // if my array is sorted then we are going to find the first occurence in left direction 
          ei = mid-1;
        }
        else if (arr[mid]>element){
            // left 
            ei = mid-1;
        }
        else{
            si = mid+1;
        }
     }
     // when the loop complete its working i am going to find the final value of fo 
     ans.add(fo);

     // but now si and ei are getting updated so we have to re-initialize it 
      si = 0;
      ei = arr.length-1;

      // first we are wrting the code of last occurence 
     while(si<=ei){
        int mid = si+(ei-si)/2;
        if(arr[mid]==element){
          lo = mid;
          // if my array is sorted then we are going to find the last occurence in right direction 
          si = mid+1;
        }
        else if (arr[mid]>element){
            // left 
            ei = mid-1;
        }
        else{
            si = mid+1;
        }
     }
     // when the loop complete its working i am going to find the final value of lo 
     ans.add(lo);
     return ans;

    }
    
    public static void main(String[] args) {
        int arr[]= {1,3,5,5,5,5,7,8,9};
        int element1 = 5;//---> 2,5
        int element2 = 10; // ---> -1,-1
        System.out.println(occurences(arr, element1));
        System.out.println(occurences(arr, element2));

    }
}
