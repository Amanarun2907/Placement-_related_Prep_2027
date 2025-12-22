import java.util.Scanner;
public class print_sqaure_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n ");
    int n = sc.nextInt();
       for(int rows = 1;rows<=n;rows++){
        for (int columns = 1;columns<=n;columns++){
            System.out.print("*");
        }
        System.out.println();
       } 




    //    for (int i = 1;i<=4;i++){
    //     System.out.println("****");
    //    }

// int i =1;
// while(i<=4){
//     System.out.println("****");
//     i++;
// }
       
    }
}
