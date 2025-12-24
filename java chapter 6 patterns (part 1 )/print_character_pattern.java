public class print_character_pattern{
    public static void main(String[] args) {
      int n = 4 ;
      char ch = 'A';
      for (int i = 1;i<=n;i++ ){
        for (int j =1;j<=i;j++){
        System.out.print(ch);
        ch++; // if current value of character is 'A' then next value of character is 'B'
        }
        System.out.println();
      }
      // In this we are updating i , j, and char value if condition does not satisfy then you have to move out of the loop 

    }


    // i = 1  j = 1              A 
    // i = 2  j = 1 2            A B 
    // i = 3  j = 1 2 3          A B C 
    // i = 4  j = 1 2 3 4        A B C D 
}