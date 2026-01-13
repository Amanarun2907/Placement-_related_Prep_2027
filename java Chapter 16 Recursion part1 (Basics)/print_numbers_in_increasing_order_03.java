public class print_numbers_in_increasing_order_03 {
   public static void printinc(int n){
    if(n==1){
        System.out.print(n+" "); // base case  
        return;
    } 
    printinc(n-1);
    System.out.print(n + " ");
   }
    public static void main(String[] args) {
        int  n= 10;
        printinc(n);
    }
}
// print numbers from 1 to n   
// importance of { } and return word 
   