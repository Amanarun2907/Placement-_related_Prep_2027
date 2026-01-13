public class print_numbers_in_decreasing_order_01{
// print the number from n to 1 in decreasing order 
    public static void printDec(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    System.out.print(n+" ");
    printDec(n-1);
}
  public static void main(String[] args) {
    //   for (int i = 10 ; i>0;i--){
    //     System.out.print(i+" ");
    //   }
    int n = 10;
    printDec(n);
  }  
}
// problem 1 
// call stack 
// stack is a type of data structure

