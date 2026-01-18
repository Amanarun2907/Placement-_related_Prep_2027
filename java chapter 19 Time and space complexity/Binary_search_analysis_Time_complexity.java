public class Binary_search_analysis_Time_complexity {
    public static int binarysearch(int arr[],int key){
        int start = 0; // starting index 
        int end = arr.length-1; // ending index 
        while (start<=end){
            int mid = start+(end-start)/2;
            // case 1 
            if(arr[mid]==key)
            {
              return mid;
            }
            // case 2
            // moving towards  left 
            // end 
            else if(arr[mid]<key)
            {
    
           start = mid+1;
            }
            //case 3
            // moving towards right
            //start
            else {// arr[mid]>key
                end = mid-1;
            }
        }
        return -1; // if element does not found
    }
    public static void main(String[] args) {
        int arr[] = {12,13,14,15,16};
        System.out.println(binarysearch(arr,14)); //3  
    }
}
//The binary search algorithm has a time complexity of O(log n) because it divides the search interval in half at each step, reducing the search space exponentially.
// Binary search always works for the sorted array . so please provide the sorted array 