public class block_scope {
    public static void main(String[] args) {
       // block scope 
       int p = 500;
       for (int i = 1;i<=10;i++){
        System.out.print(i+" "); // 1 2 3 4 5 6 7 8 9 10
        
       } 
       System.out.println();
       int i = 450;
       System.out.println(i); // 450
       System.out.println(p); // 500
      /*  System.out.println(i);*/ // i cannot be resolved into a variable 
      {
        int s = 90;
        System.out.println(s); // no error // 90
        System.out.println(p);  // 500
      }  
      /*System.out.println(s);*/   // s cannot be resolved into a variable 
     System.out.println(p); //500
   
    }
    // class scope ----> access modifier (public , private, protected , protected private , default......(oops) )
}
