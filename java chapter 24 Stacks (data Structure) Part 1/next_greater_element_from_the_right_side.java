import java.util.*;
public class next_greater_element_from_the_right_side {

    // function to find the greater element at the right side 
   public static void srk(int arr[] , Stack<Integer> s , int nxtgreater[]){
          // Original array is given....
          // Stack of Integer is given where you are basically storing integers......
          // Integer of next greater element on the right side .....

         // pop operation 
         // we want to delete all the elements which are less then or equal to the present element 
         for(int i = arr.length-1;i>=0;i--){ // right : Backward motion , // Left : Forward motion performing 
            // backward travel 
        while(s.isEmpty()!=true && arr[s.peek()]<=arr[i]){
            // Smaller : Condition : arr[s.peek]>=arr[i]
            // larger : Condition : arr[s.peek]<=arr[i]
            // ---------------------------------------------------
            // in stack we are actually storing the index not the element 
            // s.peek is the index and arr[s.peek()] then the element at the index s.peek()
            s.pop(); // Removing the element ................
        // untill i receive the larger number till then i have to remove the element ....
        }

        if(s.isEmpty()==true){
            // stack is empty 
            nxtgreater[i] = -1; 
            // No element is there which is greater than my current element .......
        }
        else{
            // if we found the index of the element which is greater than the curr element then store the arr element at the s.peek(); 
            nxtgreater [i] = arr[s.peek()];
            //  Note : Stack is only storing the index .......
        }
        // pushing the indexing 
        s.push(i);
         // we are pushing index ......
         }
   }

   // function to find the greater element at the left side 
   public static void srk1(int arr[] , Stack<Integer> s , int nxtgreater[]){
         // pop operation 
         // we want to delete all the elements which are less then or equal to the present element 
         for(int i = 0;i<arr.length;i++){
            // backward travel 
        while(s.isEmpty()!=true && arr[s.peek()]<=arr[i]){
            // in stack we are actually storing the index not the element 
            // s.peek is the index and arr[s.peek()] then the element at the index s.peek()
            s.pop();
        // untill i receive the larger number till then i have to remove the element ....
        }

        if(s.isEmpty()==true){
            // stack is empty 
            nxtgreater[i] = -1;
        }
        else{
            // if we found the index of the element which is greater than the curr element then store the arr element at the s.peek(); 
            nxtgreater [i] = arr[s.peek()];
        }
        // pushing the indexing 
        s.push(i);

         }
   }
   // function to find the smaller element at the right  side 
   public static void srk2(int arr[] , Stack<Integer> s , int nxtgreater[]){
         // pop operation 
         // we want to delete all the elements which are less then or equal to the present element 
         for(int i = arr.length-1;i>=0;i--){
            // backward travel 
        while(s.isEmpty()!=true && arr[s.peek()]>=arr[i]){ // ******
            // in stack we are actually storing the index not the element 
            // s.peek is the index and arr[s.peek()] then the element at the index s.peek()
            s.pop();
        // untill i receive the larger number till then i have to remove the element ....
        }

        if(s.isEmpty()==true){
            // stack is empty 
            nxtgreater[i] = -1;
        }
        else{
            // if we found the index of the element which is greater than the curr element then store the arr element at the s.peek(); 
            nxtgreater [i] = arr[s.peek()];
        }
        // pushing the indexing 
        s.push(i);

         }
   }
   // function to find the smaller  element at the left side 
   public static void srk3(int arr[] , Stack<Integer> s , int nxtgreater[]){
         // pop operation 
         // we want to delete all the elements which are less then or equal to the present element 
         for(int i = 0;i<arr.length;i++){
            // backward travel 
        while(s.isEmpty()!=true && arr[s.peek()]>=arr[i]){
            // in stack we are actually storing the index not the element 
            // s.peek is the index and arr[s.peek()] then the element at the index s.peek()
            s.pop();
        // untill i receive the larger number till then i have to remove the element ....
        }

        if(s.isEmpty()==true){
            // stack is empty 
            nxtgreater[i] = -1;
        }
        else{
            // if we found the index of the element which is greater than the curr element then store the arr element at the s.peek(); 
            nxtgreater [i] = arr[s.peek()];
        }
        // pushing the indexing 
        s.push(i);

         }
   }

    public static void main(String[] args) {
        // creating a stack 
        Stack <Integer> s = new Stack <>();
        Stack <Integer> s1 = new Stack <>();
        Stack <Integer> s2 = new Stack <>();
        Stack <Integer> s3 = new Stack <>();
        // original array 
        int arr []= {6,8,0,1,3};
        // nextgreater array creation
        int nxtgreater [] = new int [arr.length];



// function to find the greater element at the right side 
        srk(arr,s,nxtgreater); // 8 -1 1 3 ,-1 
        for(int i = 0;i<nxtgreater.length;i++){
                System.out.println(nxtgreater[i]);
        }
        System.out.println("Hence proved!!!");


   // function to find the greater element at the left side 
        srk1(arr,s1,nxtgreater); // -1 -1 8 8 8 
        for(int i = 0;i<nxtgreater.length;i++){
                System.out.println(nxtgreater[i]);
        }
        System.out.println("Hence proved!!!");




   // function to find the smaller element at the right  side 
         srk2(arr,s2,nxtgreater); // 0 0 -1 -1 -1 
        for(int i = 0;i<nxtgreater.length;i++){
                System.out.println(nxtgreater[i]);
        }
        System.out.println("Hence proved!!!");



   // function to find the smaller  element at the left side 

         srk3(arr,s3,nxtgreater); // -1 6 -1 0  1
        for(int i = 0;i<nxtgreater.length;i++){
                System.out.println(nxtgreater[i]);
        }
        System.out.println("Hence proved!!!");


    }
}
