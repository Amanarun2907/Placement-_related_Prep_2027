// String str = "aman"
// String str = new String("aman")
import java.util.Scanner;
public class input_output_of_a_string_02 {
  public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
    //   String name ;
    //   name = sc.next(); // important 
    //   System.out.println(name);
      String name2;
      name2 = sc.nextLine(); // important 
      System.out.println(name2);

  }  
}
// sc.next()
// sc.nextLine()
//sc.next() reads the next token (word) until it encounters whitespace, excluding the delimiter. 
//sc.nextLine() reads the entire line, including the newline character, until it reaches the end of the line. So, next() is for token-based input, while nextLine() is for line-based input.
