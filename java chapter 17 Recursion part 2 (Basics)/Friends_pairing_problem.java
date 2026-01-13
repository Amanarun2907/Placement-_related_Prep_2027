
import java.util.*;
public class Friends_pairing_problem {
    public  static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        // choice 
        // single 
        int fnm1=friendsPairing(n-1);
        // pair 
        int fnm2=friendsPairing(n-2);
        int pairways = (n-1)*fnm2;  
        // total no of ways 
        int totalways = fnm1+pairways;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the no of persons in the party");
        int n = sc.nextInt();
        System.out.println("answer: "+friendsPairing(n));
    }
}
// Given n friends , each one can reamin single or can be paired with some other frineds . Each friend can be paired only once . Find out the total number of ways in which friends can remain single or can be paired up .
// friendsPairing--->[FP]
//Dry run of the code ..................................................
// main--->FP[4]--->(2*2)+6=10
//FP[3]----->4+(1*2)=6
//FP[2]-----> RETURN 2
//FP[1]----->RETURN 1
//total ways = 2+(1*2)=4
// FP[1]---->RETURN 1
//FP[2]--->RETURN 2
// answer = 10 
//{A,B,C,D},{AB,CD},{AC,BD},{AD,BC},{D,AB,C},{D,BC,A},{D,CA,B},{B,AD,C},{,A,BD,C},{A,CD,B}
