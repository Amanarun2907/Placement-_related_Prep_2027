public class First_and_last_occ {
    public static int first = -1 ; // invalid index 
    public static int last = -1 ; // invalid index

    public static void first_last (String s , char p , int idx){
        // recurrsion
        // base case 
         if (idx == s.length()){
            System.out.println(first);
            System.out.println(last);
            return ; // invalid index 
         }
        // kaam 
        char ch = s.charAt(idx); // character at index idx
        if(ch == p){
            if(first == -1){
                first = idx;
            }
            else { // first ! = -1
                last = idx; // updating 
            }
        }
        first_last(s, p, idx+1);

    }
    

    public static boolean sorted (int arr[] , int idx){
        // recurrsion
        // array is given , now true is array is sorted and false is not sorted
        // if array is ascending then true otherwise false .....  
        // base case 
        if (idx == arr.length-1){
            return true ; 
        }
        // kaam 
        if(arr[idx]>arr[idx+1]){
            return false ;
        }
        return sorted (arr , idx+1);

    }

    public static void main (String [] args){
        String s = "abaacdaefaah" ; 
        char  p = 'a';
        first_last (s , p , 0);



    int arr1 [] = {1,2,3,4,5,6,7,8,9,10};
    int arr2 [] = {1,2,3,4,6,5,7,9,10};
    int arr3[] = {34,35,36,37,39,100};
    System.out.println(sorted(arr1 , 0));
    System.out.println(sorted(arr2 , 0));
    System.out.println(sorted(arr3 , 0));




    
    }
}