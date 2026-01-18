public class First_and_last_occ {
    public static int first = -1 ; // invalid index 
    public static int last = -1 ; // invalid index

    public static void first_last (String s , char p , int idx){
        // recurrsion
        // base case 
         if (idx == s.length()){
            System.out.println(first);
            System.out.println(last);
            return ; // invalid index 
         }
        // kaam 
        char ch = s.charAt(idx); // character at index idx
        if(ch == p){
            if(first == -1){
                first = idx;
            }
            else { // first ! = -1
                last = idx; // updating 
            }
        }
        first_last(s, p, idx+1);

    }


    public static void main (String [] args){
        String s = "abaacdaefaah" ; 
        char  p = 'a';
        first_last (s , p , 0);
    }
}