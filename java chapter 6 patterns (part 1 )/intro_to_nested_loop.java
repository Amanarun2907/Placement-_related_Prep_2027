import java.util.Scanner;
public class intro_to_nested_loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n: ");
        int n = sc. nextInt();
        // print star pattern 
        // nested loop (loop inside loop)
        // used to build logic 
        // step 1: no of rows ---->outer loop 
        // step 2: no of columns----->inner loop 
        // step 3: build a pattern 
        // step 4: what of print 



        for (int row = 1;row<=n;row++){ // used for rows 
            for(int column = 1;column<=row;column++){ // uesd for columns and build logic 
                System.out.print("*"+" "); // print what you need 
            }
            System.out.println(); // used for next line 
        }



        // row 1 : *       column = 1
        // row 2 : * *     column = 2
        // row 3 : * * *   column = 3
        // row 4 : * * * * column = 4
       //   and so on ......


        for (int row = 1;row<=n;row++){ // used for rows 
            for(int column = 1;column<=row;column++){ // uesd for columns and build logic 
                System.out.print(column +" "); // print what you need 
            }
            System.out.println(); // used for next line 
        }


        // row 1 : 1
        // row 2 : 1 2 
        // row 3 : 1 2 3 
        // row 4 : 1 2 3 4 
       // and so on .........
    }
}