public class Hierarchial_inheritance {
    public static void main(String[] args) {
       Mammal x = new Mammal();
        x.eat();
        x.breathe();
        x.walk_rate();
        System.out.println();
        Fish y = new Fish();
        y.eat();
        y.breathe();
        y.swim();
        System.out.println();
        Animal z = new Animal();
        z.breathe();
        z.eat();
        System.out.println();
    }
}
// base class Animal
class Animal { 
    String color;
 void eat(){
     System.out.println("Animal is eating");
 }
 void breathe (){
     System.out.println("Animal takes breathes");
 }
}
// derived class of animal 
class Fish extends Animal {
 int fins ;
 void swim(){
     System.out.println("Fish swims in water");
 }
}
// derived class of animal  
class Mammal extends Animal{ // angel fish is the type of fish 
    void walk_rate(){
        System.out.println("tells about the walk rate of Mammal");
    }
}
// hierarchial inheritance 
// code is the example of hierarchial inheritance 
