import java.util.*;
public class stock_span_problem_Next_Greater_Element {
    public static void stock_span_problem (int stock[] , int span[]){
        // stack creation to stock the index 
        // span is the array to store the span value
        Stack <Integer> s1 = new Stack<>();
        span[0]= 1; // for the 1st element the span (maximum number of consecutive days where the price is equal to or less than the current price is called the span )
        s1.push(0); // index value  is 0
        for (int i = 1 ; i<stock.length;i++){
            int current_price = stock[i];
            while(!s1.isEmpty() && current_price>=stock[s1.peek()]){
                s1.pop(); // all the index which have less or equal price than current price we are eleminating them so that we have with those index at which price is greater 
            }
            if(s1.isEmpty()){
                span[i]= i+1; // corner case (no price is greater the current price previously )
            }
            else {
                int prevIndex = s1.peek();
                span[i] = i-prevIndex; // we are storing the value of index
            }
            s1.push(i); // in stock we are storing the value of index 
        }
    }


    public static void next_Greater_element (int arr[],int next_G[]){
    Stack<Integer> s1 = new Stack<>();
    for (int i = arr.length-1 ; i>=0;i--){ // backward movement 
    int current = arr[i];
    // while
    while (!s1.isEmpty() && arr[s1.peek()]<=arr[i])
    {
        s1.pop();
    }
    // if-else
    if(s1.isEmpty()){
        next_G[i] = -1; 
    }
    else{
       next_G[i] = arr[s1.peek()];
    }
    // push the current index in stack
    s1.push(i);
    }
    
    }
    public static void main (String [] args){
//     int stock [] = {100,80,60,70,60,85,100};
//     int span[] = new int[stock.length]; 
//     stock_span_problem(stock , span);
//     for (int i = 0 ; i<span.length;i++){
//         System.out.println(span[i]);
//     }
// System.out.println();
   
    int arr[] = {6,8,0,1,3};
    int next_G[] = new int[arr.length];
    next_Greater_element(arr, next_G);
   for(int i =0 ; i<next_G.length;i++){
    System.out.println(next_G[i]);
    }
    }

    

}
