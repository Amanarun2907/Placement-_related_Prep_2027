import java.util.Scanner;
public class print_half_pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = sc.nextInt();
       for (int i = 1;i<=n;i++){
        for (int j =1 ;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
       } 
       // here i is used to display row and j is  used to display columns 
       // 1                  i = 1 , j = 1
       // 1 2                i = 2 , j = 1 2 
       // 1 2 3              i = 3 , j = 1 2 3
       // 1 2 3 4......so on i = 4 , j = 1  2 3 4
    }
}
