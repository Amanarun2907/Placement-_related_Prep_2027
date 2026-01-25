public class Find_Subsets_in_a_String {
    // find and print all the subsets of a given string 
    public static void findsubsets (String str , String ans , int i )
    {
        if(i==str.length()){
            if(ans.equals("")){ // use equals 
                System.out.println("Null");
            }
            else{
            System.out.println(ans);
            }
            return ;
        }
    // Base case 
    // recursion 
    // yes choice
    findsubsets(str,ans+str.charAt(i),i+1);// String concatenation 
    // no choice 
    findsubsets(str,ans,i+1);

    } 
    public static void main(String[] args) {
        String str = new String("xyz");
        findsubsets(str,"",0);
    }
}
// Sets and Relation 
// A= {1,2,3}
// possible subsets : (),(1),(2),(3),(1,2),(2,3),(3,2),(1,2,3)
// no of subsets : (2^n) where n is the number of  elements
// A   B    C  (Recursion + BackTracking )...........................
// Y   Y    Y  = ABC 
// Y   Y    N  = AB
// Y   N    Y  = AC
// Y   N    N  =  A
// N   N    N  =  ""
// N   N    Y  =  C
// N   Y    N  =  B
// N   Y    Y  =  BC


//The code recursively generates all possible subsets of the input string 'str'. At each step, there are two recursive calls, one including the current character and one excluding it. This results in a time complexity of O(2^n) where n is the length of the input string.
// T.C = O(n*2^n)..........
// S.C = O(n)..............