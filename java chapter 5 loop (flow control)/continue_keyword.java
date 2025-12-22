public class continue_keyword{
    public static void main(String[] args) {
    // to skip the perticular iteration in the loop  ---->Continue statement 
    // to come out of the loop  at perticular iteration ----> break keyword
     for (int i = 1;i<=5;i++){
        if(i==3)
        continue; // no need to write {}
            System.out.println(i);
     }
     System.out.println("thanks for learing continue keyword ");

    }
}