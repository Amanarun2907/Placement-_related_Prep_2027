public class Quick_sort {
    public static void printarr(int arr[]){ // print function 
    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void quickSort(int arr[],int si,int ei){
     if(si>=ei){// base case 
        return;
     }
     // pivot element is my last element of the array
     int pidx=partition(arr,si,ei); 
     quickSort(arr,si,pidx-1);// recursion 
     quickSort(arr,pidx+1,ei);// recursion 
    }
    public static int partition(int arr[],int si,int ei){
       int pivot= arr[ei];
       int i = si-1; // to make place for elements smaller than pivot
       for(int j = si;j<ei;j++){ // j is not moving to ending index please note it 
    // we do not have to assume that 0 is the starting index . 
        if(arr[j]<=pivot){
            i++;
            // swap the value at index i and j 
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
        i++;
        int temp = pivot;
        // int temp = arr[ei]; // but Time limit exceeded error is there in gfg
        arr[ei]=arr[i]; // pivot = arr[i] do not write it ..
        // as pivot is a variable so we do not write pivot = arr[i];
        arr[i]=temp;
        return i;
    }
   public static void main(String[] args) {
    int arr[]={6,3,9,8,2,5,11}; 
    quickSort(arr,0,arr.length-1);
    printarr(arr);  
   } 
}
// time complexity in Quick sort 
// Average case o(nlogn)
// Worst case o(n^2) ... very important to note when pivot element is largest or smallest .....
// Space complexity o(1)
// Pivot and partition 
// Steps to solve it 
// Pivot (Last element)
// Partition (parts)
// Quick sort on left and right part
// Base case :  if only one element is present in an array then array is sorted in nature.
//example 
// arr[]={6,3,9,8,2,5}
// i= -1
// j =starting index = 0
// pivot element = 5  
// so first comparision (6>5)--> nothing 
// so second comparision (3<5)-->i++    temp arr[j] arr[i]
//                                        3       3    6  
//                                        3       6    6
//                                        3       6    3
// so now arr[3,6,9,8,2,5]
// so third comparision (9>5)---> nothing
// so forth comparision (8>5)---> nothing
// so fifth comparision (2>5)--->i++------> temp arr[j]  arr[i]
//                                            2      2      6   
//                                            2      6      2 
//                                            2      6      2
// so now array [3,2,9,8,6,5]
//  so now i++ so i = 2 
// int temp = arr[ei]  = 5
// temp arr[i]  arr[ei]
//  5      9         5
//  5       9        9
//  5        5       9
// now final array is [3,2,5,8,6,9]    


// very important .................................
// Worst case importance 
// Worst case occurs when pivot is always the smallest or the largest element 
// equation of straight line y = ax+b
// process to calculate the time complexity 
// Experimental analysis 
// Theoritical analysis 
// we always calculate time complexity with the process on theoritical analysis 
 