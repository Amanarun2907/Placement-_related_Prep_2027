

import java.util.*;
public class Subsequences {
    // function to count the subsequences 
    public static int subseq (String str , int idx , String newstr){
        // str is the original string 
        // idx is the value of the index 
        // newstr is the combination or the subsequence string 
        //  base case 
         if(idx == str.length()){
            return 1; 
         }

        // kaam 
        char currchar = str.charAt(idx);
        // addition 
        int srk1  = subseq (str , idx+1 , newstr + currchar);
        // not addition 
       int srk2 =  subseq (str , idx+1 , newstr);
        // return statement 
        int final_ans = srk1+srk2;
        return final_ans;

    }
    

    // code to write the unique subsequences .............
    public static int subseq1 (String str , int idx , String newstr , HashSet<String> set){
        // str is the original string 
        // idx is the value of the index 
        // newstr is the combination or the subsequence string 
        //  base case 
         if(idx == str.length()){
            if(set.contains(newstr)){
             return 0 ;
            } 
            else{
                set.add(newstr);
                return 1 ;
            }
         }

        // kaam 
        char currchar = str.charAt(idx);
        // addition 
        int srk1  = subseq1 (str , idx+1 , newstr + currchar , set);
        // not addition 
       int srk2 =  subseq1 (str , idx+1 , newstr , set);
        // return statement 
        int final_ans = srk1+srk2;
        return final_ans;

    }

   // Keypad combination code
   public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
   // user ---> 23 (input)
   // output ---> at 2 choices are {d,e,f} and at 3 {g,h,i} then combinations are {dg,dh,di,eg,eh,ei,fg,fh,fi}
   // output ---> {dg,dh,di,eg,eh,ei,fg,fh,fi} (possible combination)
   public static void keypad (String str , int idx , String combination){
    // using recurrsion 
    // base case
   if(idx==str.length()){
    System.out.println(combination);
    return;
   }
    // kaam 
  char currchar = str.charAt(idx); // current character of the string str at index idx ..........
  String mapping  = keypad[currchar-'0'] ; // user input is like "23"
   for (int i = 0 ;i<mapping.length();i++){
    keypad(str, idx+1,combination+mapping.charAt(i));
   }
 

  

}
// first and last occurences of the element in the array 
public static int fo = -1; // invalid index 
public static int lo = -1; // invalid index 
public static void folo (int arr[], int idx ,int key){
    // recurrsion 
    // base case 
    if(idx==arr.length){
        System.out.println(fo);
        System.out.println(lo);
        return ;
    }

    // kaam 
    // milna chahiye 
    if(arr[idx]==key){
        if(fo==-1){
        // if  fo is -1 and arr[idx]==key is  true then we are getting element first time 
        fo = idx;
        }
        else{
        lo = idx ;
        }
    }
    folo(arr,idx+1,key);
    }




    public static void main (String [] args ){
        // System.out.println(subseq("abcde", 0, "")); // 2^5 = 32
        // HashSet<String> set = new HashSet<>();
        //  System.out.println(subseq("aaa", 0, "")); // 2^3 = 8 // Main Problem 
        // System.out.println(subseq1("aaa", 0, "" , set)); // 4
        // keypad("67",0,"");
        int arr[] = {9,2,3,4,4,3,5,6,7,4,4,4,4,8,8,8,8,9};
        int key = 9;
        folo(arr, 0, key); 
        // o.p => fo --> 0,lo-->17
    }
}