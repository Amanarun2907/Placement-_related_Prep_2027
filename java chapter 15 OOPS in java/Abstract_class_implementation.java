public class Abstract_class_implementation{
    public static void main(String[] args) {
       dog d1 = new dog();
    //    d1.eat();
    //    d1.fly();
    //    System.out.println(d1.color); // brown 
    //    d1.changecolor();
    //    System.out.println(d1.color); // dark brown
         butterfly b1 = new butterfly();
    //      b1.eat();
    //      b1.fly();
    // System.out.println(b1.color); // brown 
    //    b1.changecolor();
    //    System.out.println(b1.color); // red 

    }
}
abstract class animal {
    animal (){
       System.out.println("Animal class constructor is calling .........");
    }
    String color;
    // animal (){
    //     color = "brown";
    // }
    void eat () {
        System.out.println("Animal is eating");
    }

    abstract void fly(); // idea
}
class dog extends animal {

    dog (){
       System.out.println("dog class constructor is calling .........");
    }
    void changecolor(){
        color = "dark brown";
    }
    void fly (){
        System.out.println("No");
    }
}
class butterfly extends animal {

    butterfly (){
       System.out.println("butterfly class constructor is calling .........");
    }
    void changecolor (){
        color = "red";
    }
    void fly() {
      System.out.println("yes");
    }
}