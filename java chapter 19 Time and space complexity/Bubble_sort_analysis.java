public class Bubble_sort_analysis {
    public static void main(String[] args) {
        // int arr[] = new int [5];
        int arr[]={5,4,3,22,1};
        for (int  turn = 0 ; turn <arr.length-1;turn++){
            boolean swapped = false;
            for(int j= 0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                // this indicates that array is already sorted in ascending order so break it and do not run it till the end..
                break;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// turn = 0 ---> j = 0,1,2,3,4 so j= 0 to n-1
// turn = 1 -----> j= 0,1,2,3  so j= 0 to n-3
// turn = 2 ----> j= 0,1,2     so j= 0 to n-3
// turn = 3 -----> j= 0,1      so j= 0 to n-4
// turn = 4 ----> j= 0         so j= 0 to n-5
// sum = (n-1)+(n-2)+(n-3) +...........1= n/2(n+1) 
// in worst case time complexity is o(n^2)..................
// in all the cases in the bubble sort time complexity is o(n^2)
// so we have to optimized it by creating a boolean variable so that in best case the time complexity reduces to o(n) from o(n^2)..........
// so need to optimized it ................................
//The code snippet implements the Bubble Sort algorithm, which has a worst-case time complexity of O(n^2) where n is the number of elements in the array. The nested loops iterate through the array elements, comparing and swapping them if necessary, leading to a quadratic time complexity.