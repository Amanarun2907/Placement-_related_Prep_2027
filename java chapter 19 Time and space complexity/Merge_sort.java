
//Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.
// gfg 
public class Merge_sort {
public static void printarr(int arr[]){
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
public static void divide(int arr[],int si , int ei){
    // base case 
    if(si>=ei){
        return;
    }
    // si is the starting index 
    // ei is the ending index
    int mid = si+(ei-si)/2; // this is my middle index 
    divide(arr, si, mid); // this is my left part 
    divide(arr,mid+1,ei); // this is my right part 
    merge(arr,si,mid,ei);
}  
public static void  merge(int arr[], int si,int mid,int ei){
    // Scanner sc=  new Scanner (System.in)
  int temp [] = new int [ei-si+1]; // creating a temp array
  int i = si; // iterator for left part 
  int j = mid+1;// iterator for right part 
  int z =0; // iterator for temp array 
  while(i<=mid && j<=ei){ // left part
    if(arr[i]<arr[j]){
        temp[z] = arr[i]; // copying the element 
        i++; 
    }
    else{
        temp[z]=arr[j]; // right part
        j++;

    }
    z++; 
  }
  // left part 
  while(i<=mid){
    temp[z++]=arr[i++];// taking the current value then increment it by one unit 
    
  }
  // right part
  while(j<=ei){
    temp[z++]=arr[j++];
  }
  // copy temp to original array 
  for ( z = 0,i=si ;z<temp.length;z++,i++){
    arr[i]=temp[z];
  }
} 
    public static void main(String[] args) {
     int arr[]={6,3,9,5,2,8,-6}; // given array 
     System.out.println(arr.length);
     divide(arr,0, arr.length-1); 
     printarr(arr);
    }
}
// time complexity = nlogn (good tc)
// space complexity = o(n)
// Deepth first streategy 
//.........................................................................
// arrange the elements in the ascending or descending order 
// step 1 
// divide my array into smaller subparts 
// find out the middle element of the array 
// if in an array only 1 element is present then that array is sorted in nature
// From starting and ending index we can find the middle index 
// step 2
// recursively solve the left and right part 
// step 3 
// merge  