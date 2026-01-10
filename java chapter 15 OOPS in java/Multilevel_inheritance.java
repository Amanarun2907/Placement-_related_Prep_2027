public class Multilevel_inheritance {
    public static void main(String[] args) {
        Angelfish x = new Angelfish();
        x.eat();
        x.breathe();
        x.swim();
        x.swim_rate();
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
// base class  Animal
class Animal { 
    String color;
 void eat(){
     System.out.println("Animal is eating");
 }
 void breathe (){
     System.out.println("Animal takes breathes");
 }
}
// derived class of Animal
class Fish extends Animal {
 int fins ;
 void swim(){
     System.out.println("Fish swims in water");
 }
}
// derived class of fish 
class Angelfish extends Fish{ // angel fish is the type of fish 
    void swim_rate(){
        System.out.println("tells about the swim rate of angel fish");
    }
}
// multilevel inheritance 
// code is the example of multilevel inheritance
