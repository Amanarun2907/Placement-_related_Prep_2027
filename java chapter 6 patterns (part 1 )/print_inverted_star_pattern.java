import java.util.*;
public class print_inverted_star_pattern {
    public static void main(String[] args) {
       // print a inverted star pattern 
    
       Scanner sc = new Scanner (System.in);
       System.out.println("enter the value of n: ");
       int n = sc.nextInt();



       for (int rows = 1;rows<=n;rows++){ // no of rows 
        for (int columns = 1;columns <=n-rows+1;columns++){ // no of columns and build a logic // j = n-i+1
            System.out.print("*"+" ");  
        }
        System.out.println();
       } 

for (int rows = 1;rows<=n;rows++){ // no of rows 
        for (int columns = 1;columns <=n-rows+1;columns++){ // no of columns and build a logic // j = n-i+1
            System.out.print(columns +" ");  
        }
        System.out.println();
       } 
 // here logic is that star = n(user input ) - row + 1
 //   example n = 5 
 //   row = 1 : star = 5 - 1 + 1 = 5 
 //   row = 2 : star = 5 - 2 + 1 = 4
 //   row = 1 : star = 5 - 3 + 1 = 3 
 //   row = 1 : star = 5 - 4 + 1 = 2
 //   row = 1 : star = 5 - 5+ 1 =  1 
    }
}
