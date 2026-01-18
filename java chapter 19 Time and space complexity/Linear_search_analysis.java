public class Linear_search_analysis {
    public static int linearsearch(int arr[], int key){
        for (int i = 0;i<arr.length;i++){
            if(arr[i]==key){
            return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {3,2,6,6,12};
System.out.println(linearsearch(arr, 6));
    }
}
//The code snippet contains a single for loop that iterates through the array elements. In the worst-case scenario, the loop will iterate through all elements of the array, resulting in a linear time complexity of O(n), where n is the number of elements in the array.	