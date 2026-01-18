public class Rotated_sorted_array_without_recursion {
    // modified binary search type problem 
    public static int search (int arr[], int key){
        int si = 0;
        int ei = arr.length-1;
        // array is rotated sorted array . 
        // rotation about the pivot element ..
        // array is sorted ....
        while(si<=ei){ // always in case of single element then si = ei otherwise si<ei....
         int mid = si+(ei-si)/2;
         if(arr[mid]==key){
            return mid;
         }
         if (arr[si]<arr[mid]){// case of line 1
            if (key>=arr[si] && key<=arr[mid]) { // left part 
               ei = mid-1;

            }
            else{ // right part of line l1
                  si = mid +1 ;
            }
         }
         else{ // case of line 2
           if (key>=arr[mid] && key<=arr[ei]) { // right of l2
               si = mid+1;
           }
           else{
                ei = mid-1;
           }
         }
        }
        return -1; // key not found 
    }
    public static void main (String [] args ){
        int key = 7;
        int arr[]= {4,5,6,7,0,1,2};
        // index is 4 ............
        int ans = search(arr, key);
        System.out.println(ans);
    }
}
