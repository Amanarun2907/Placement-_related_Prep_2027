public class sorted_and_rotated_Array_search {

public static int search(int arr[], int tar,int si,int ei){
// find out the mid 
if(si>ei){
    return -1;  
}
int mid = si+(ei-si)/2;
// case Found 
if(arr[mid]==tar){
    return mid;
}
// Mid lie on line 1 
if(arr[si]<=arr[mid]){
    //case a: target lie on line 1 but on left side
    if(arr[si]<=tar && tar<=arr[mid]){
       return  search(arr,tar,si,mid-1);
    }
    // case b : target lie on line 1 but on right side
    else{
      return search(arr,tar,mid+1,ei);  
    }
}
// mid lie on line 2 
else{
    // case c :  target lie on line 2 but on right side 
    if(tar>=arr[mid] && tar<=arr[ei]){
   return search (arr,tar,mid+1,ei);
    }
    // case d  : target lie on line 2 but on left side
    else{
    return search(arr,tar,si,mid-1);
    }
}
}
 public static void main(String[] args) {
     int arr[] = {4,5,6,7,0,1,2};
     int target = 0;
    //  search(arr,target,0,arr.length-1);
     System.out.println(search(arr,target,0,arr.length-1));
 }   
}
//Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key. Return -1 if the key is not found.
// modified binary search 