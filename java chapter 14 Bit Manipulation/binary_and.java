import java.util.*;
public class binary_and {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second  number: ");
        int b = sc.nextInt();
      System.out.println("the bitwise operator (and) of these number is: "+(a&b));

    }
}
// feel like multiplication 
// 5 = 101
// 6 = 110
//5&6= 100 ---> 4 in decimal 
