import java.util.*;
public class first_non_repeating_letter_in_a_stream_of_character {
  public static void F_N_R_L_S(String s1){
  // frequency array to calculate the frequency of the array 
  // Input of a string 
  // Use of queue
  int frequency[] = new int[26]; // 0-25
  Queue<Character> q1  = new LinkedList<>();
  for (int i = 0 ; i<s1.length();i++){
    char ch = s1.charAt(i); // track the current character 
    q1.add(ch); // Using JCF .... adding character 
    frequency[ch-'a']++; // frequency adjusting 
  
   while (!q1.isEmpty() && frequency[q1.peek()-'a']>1){
    // peek is in front 
    q1.remove();
  }
  // case 1 : queue is empty 
  if(q1.isEmpty()){
   System.out.print("-1"+" ");
  }
  // case 2 : frquency is equal to 1  
  else {
    System.out.print(q1.peek()+" ");
  }
//   System.out.println();
  }
}
    public static void main (String []args){
        String s1 = "aabccxb";
        // i/p : "aabccxb"
        // o/p : "a-1bbbbx"
        for(int i = 0 ; i<s1.length();i++){
            System.out.print(s1.charAt(i)+" ");
        }
        System.out.println();
        F_N_R_L_S(s1);
    }
}
