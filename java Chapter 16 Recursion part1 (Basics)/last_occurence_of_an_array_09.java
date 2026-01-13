// important question 
public class last_occurence_of_an_array_09 {
    public static int  last_occurence(int arr[],int key , int i){
        if(i==arr.length){
            return -1;  // i is equal to the length of the array .arr.....arr.....arr....arr.
        }
        int isfound=last_occurence(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i; // element found at certain index 
        }
       
            return isfound; // if element not found 
        }

    public static void main(String[] args) {
        int arr[] = {2,4,6,4};
        System.out.println(last_occurence(arr, 4, 0));
        System.out.println(last_occurence(arr, 10, 0));
        // System.out.println(last_occurence(arr, 8, 0));
    }
}

// arr[]={2,4,6,4}
// key = 4 
// i from 0
// answer is 3 
//last_occurence(arr,4,0) ====> return 3 
//last_occurence(arr,4,1) = isfound  ====> return 3 
// last_occurence(arr,4,2) = isfound ===> return 3 
// last_occurence(arr,4,3) = isfound ===> isfound = -1 and arr[3] = 4 then it will return 3 
// last_occurence(arr,4,4)  return -1