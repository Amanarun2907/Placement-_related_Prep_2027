public class Merge_sort_analysis {
    public static void print_array(int arr[]){
        for(int p = 0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
    }
    public static void mergesort(int arr[], int si , int ei){
        if(si>=ei){ // BASE CASE 
            return;
        }
        int mid  = si+(ei-si)/2; // or int mid = (si+ei)/2 // MIDDLE ELEMENT 
        mergesort(arr,si,mid); // RECURSION 
        mergesort(arr,mid+1,ei); // RECURSION 
        merge(arr,si,mid,ei); 
    }
    public static void merge(int arr[],int si,int mid,int ei){
    int i = si; // idx for 1st sorted part 
    int j = mid+1; // idx for 2nd sorted part 
    int z = 0;
    int temp[] = new int[ei-si+1]; // CREATION OF AN TEMP ARRAY 
    // 1st while loop 
    // comparision between 1st and 2nd sorted part 
    while(i<=mid && j<=ei ){
        if(arr[i]<arr[j]){
            temp[z] = arr[i];
            i++;z++;
        }
        else{
            temp[z] = arr[j];
            j++;z++;
        }
    }
    // 2nd while loop 
    //  left elements in 1st sorted part 
    while(i<=mid){
temp[z] = arr[i];
z++;i++;
    }
    // 3rd while loop
    // left elements in the 2nd sorted part 
    while(j<=ei){
        temp[z]= arr[j];
        z++;j++;
    }
    // copy of the elements
     for(z = 0,i=si;z<temp.length;i++,z++){
        // we do not write i<arr.length
        arr[i]=temp[z];
    }
    // time complexity (1st,2nd and 3rd while loop is O(n)
    // time complexity of worst case in copy of the elements is o(n)
    // total time complexity = o(n)
    // T(n) = T(n/2)+T(n/2)+n+k
    // Time complexity = O(nlogn)........................................
    // Space complexity = O(n).....// beacase of temp array creation 
}
    public static void main(String[] args) {
        int arr[]={45,23,55,0,10,100};
        mergesort(arr, 0, arr.length-1);
        print_array(arr);
    }
}
// calculation of space complexity = no of levels * memory consumption in each level 
// calculation of time complexity ==> total work done = no of levels * Work done at each level / Using recurrence relation 
//The code implements the merge sort algorithm, which has a time complexity of O(nlogn) in the worst case scenario. The merge function merges two sorted arrays in linear time, and the mergesort function recursively divides the array into halves until reaching the base case, resulting in a logarithmic number of levels. Therefore, the overall time complexity is O(nlogn).