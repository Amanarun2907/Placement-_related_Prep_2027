



public class Find_permutations {
   
    // method 2 
    public static void Find_permutations_01(StringBuilder str,int i )
    {
          // base case 
          if( i == str.length()){
            System.out.println(str);
            return;
          } 
          for (int j =i ;j<=str.length()-1;j++)   
          {
            // swaping 
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);

            Find_permutations_01(str, i+1); // recursion 
            
            // backtracking  is very important in this 
            // swaping 
             temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);

          }
    }
 

    // method 1 to solve the question 
    public static void findpermutations(String str , String ans)
    {
        // base case 
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }
        // recursion 
        for (int i =0 ; i<str.length();i++){
             char cc = str.charAt(i); // measure the current character at  i in the string 
             // "abcde" = "ab"+"de" = "abde" so c is removed 
            String  Newstr = str.substring(0,i) + str.substring(i+1); // character at i of a string is removed ..
             findpermutations(Newstr, ans+cc);
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder  str1 = new StringBuilder("abcd");
        // findpermutations(str, "");
        Find_permutations_01(str1, 0);
    }
}
// permutation and combinations 
// npr and ncr 
// npr = n!/(n-r)! (r)!





// DIFFERENCE BETWEEN CALL BY VALUE AND CALL BY REFERENCE 
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
//     public static void changevalue(int a){
//         a= 20;
//      System.out.println(a);
//     }


//     public static void changevalue1(int arr[]){
//         for(int i  =0 ;i<arr.length;i++){
//             arr[i]= arr[i]+10;
//         }
        
//     }
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here

// call by value 
// // 		int a = 10;
// //     System.out.println(a); // 10 
// // 	    changevalue(a);  // 20 

// //       System.out.println(a);   // 10 


// call by reference
// int arr[] = {10,20,30};
// for (int i = 0;i<arr.length;i++){  // 10 20 30 
//     System.out.print(arr[i]+" ");
// }
// System.out.println();
// changevalue1(arr);    // 20 30  40  

// for (int i = 0;i<arr.length;i++){
//     System.out.print(arr[i]+" ");
// }  // 20 30 40 
// 	}
// }
