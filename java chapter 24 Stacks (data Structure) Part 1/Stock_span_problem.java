
import java.util.*;
public class Stock_span_problem {

public static void stockspan(int stocks[] , int span[] ){
    Stack <Integer> s = new Stack <>(); // Only storing the indexes here ..................
    span[0] = 1 ; //i+1 
    s.push(0); // we are actually storing the index of the element of the span 
    // pushing the index here ..................
    for(int i = 1;i<stocks.length;i++){
        int current_price = stocks[i]; // today's price 
        while(s.isEmpty()!=true && current_price>=stocks[s.peek()]){
            // price is less than or equal to today's price 
          s.pop(); // remove ................
          // stack will store the index because to track the element with the index is easy 
        }
        if(s.isEmpty()==true){ // stack is empty 
            // return -1 if the stock is empty in next greater (from right side) problem 
            span[i] = i+1;
        }
        else{
            // formulation 
            // span[i] = i-prevhigh
            // if the stalk is not empty 
            int previous_high = s.peek(); // top element 
            span[i] = i -previous_high;    

        }
        // pushing the index ...... 
        s.push(i);


    } 
}
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        // stock prince is given to you 
        // day 1 = 100 
        // day 2 = 80 
        // day 3 = 60 
        // day 4 = 70 
        // day 5 = 60 
        // day 6 = 85 
        // day 7 = 100 
        // Span is the maximum number of consecutive days for which price<=todays price
        int span []= new int [ stocks.length];
        // function calling
        stockspan(stocks , span);
        // printing
        for (int i = 0 ; i <span.length;i++){
        System.out.println(span[i]);
        } 

    }
}
