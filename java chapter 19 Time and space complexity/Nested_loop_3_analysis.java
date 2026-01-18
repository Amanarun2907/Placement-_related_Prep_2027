public class Nested_loop_3_analysis {
    public static void main(String[] args) {
       //Some k<r
       int n = 20;
       int k =3;
       for (int i = 0;i<n;i=i+k){
        for(int j = 0;j<=k;j++){
            System.out.println("("+i+","+j+")");
            // some constant work 
            // is done in this loop 
        }
           } 
    }
}
// nested loop 3 analysis 
// time complexity = O(n)
//The outer loop runs 'n/k' times, where 'k' is a constant value. The inner loop runs 'k+1' times, which is also a constant value. Therefore, the overall time complexity is O(n)
