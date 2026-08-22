import java.util.*;
public class Maximum_no_of_India_coins {
    
 public static int min_coins (Integer coins[], int amt){
    // coins (descending order)
    Arrays.sort(coins, Collections.reverseOrder());
    ArrayList <Integer> ans = new ArrayList<>();
    int no_coins = 0;
    for(int i = 0;i <coins.length;i++){
        if(amt>=coins[i]){
            while(amt>=coins[i]){
                no_coins++;
                amt-=coins[i];
                ans.add(coins[i]);
            }
        }
    }

    for(int i = 0 ; i<ans.size();i++){
        System.out.print(ans.get(i)+" ");
    }
    System.out.println();
    return ans.size();

 }
    public static void main (String []args){
    Integer coins[] = {1,2,5,10,20,50,100,500,2000};
    int amount = 590; 
 // you need to use the minimum no  of coins to make this amount 
     System.out.println(min_coins(coins,amount));
    }
}
