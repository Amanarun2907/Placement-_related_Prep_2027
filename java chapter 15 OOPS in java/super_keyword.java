public class super_keyword {
   public static void main(String[] args) {
      Horse h = new Horse(); 
    //   Animal constructor is called 
    //   Horse constructor is called 
    System.out.println(h.color);
    // Animal constructor is called 
    // Horse constructor is called
    // Black

   } 
}
class Animal {
    Animal(){
        System.out.println("Animal constructor is called ");
    }
    String color;
    void eat (){
        System.out.println("Animal is eating so do not disturb ");
    }
}
class Horse extends Animal {
    Horse(){
        super();
        super.color = "Black";
        super.eat();
        System.out.println("Horse constructor is called ");
    }
}
// super keyword is user to refer immediate parent class object 
// to access parent properties 
// to access parent function 
// to access parent constructor
// constructor chaining in java (homework )