public class what_happens_in_memory {
    public static int add(int a,int b ){
        return a+b;
    }
    public static void main(String[] args) {
       int final_add = add(5,5);
       System.out.println("sum is : "+final_add);
       
        // what happens in memory : 
        // call stack Last in first out 
        // in call stack : main --calling sum--->sum   sum will return the value of main and remove from call stack .  
        // also studied call stack in Recurrsion . 
        // call stack forms the basic of recurrsion . 
    }
}
