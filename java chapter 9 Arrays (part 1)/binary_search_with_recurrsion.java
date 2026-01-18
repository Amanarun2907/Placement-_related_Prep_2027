public class binary_search_with_recurrsion {
     public static int search (int arr[], int key ,int si , int ei){
        // solve with recursion 
        // sorted array 
        // you have given an element , you have to find its index and if element is not present then return -1   
        // base case 
        if(si>ei){
            return -1;
        }
        // kaam
        int mid = si+(ei-si)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if (arr[mid]>key){
         // recursive call
         // left 
          return search (arr,key,si,mid-1);
        }
        else{ // arr[mid]<key
         // recursive call 
         // right 
         return search (arr,key,mid+1,ei);
        }

     }

    public static void main(String[] args) {
        int arr[]= {5,6,7,8,11,13,14};
        int key = 11 ;// 04
        int key1 = 13;
        // function calling 
        System.out.println(search(arr, key, 0, arr.length-1)); // 04
        System.out.println(search(arr, key1, 0, arr.length-1)); // 04
        System.out.println(search(arr, key, 0, 3)); // 01

    }
}