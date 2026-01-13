public class check_array_is_sorted_or_not_07 {
    public static boolean isSorted(int arr[], int i ) {
        if(i==arr.length-1){ // we are talking about the last index....... 
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,16,7,8,9};
        System.out.println(isSorted(arr,6));
        System.out.println(isSorted(arr,0));
    }
}
// If array is like 34 45  67 87 then array is sorted
// time complexity = 0(n)
// space complexity = 0(n)