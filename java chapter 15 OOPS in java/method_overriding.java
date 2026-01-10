
public class method_overriding {
    public static void main(String[] args) {
       Animal a = new Animal ();
       a.eat();
       dog d = new dog ();
       d.eat(); 
    }
}
class Animal {
void eat (){
    System.out.println("i am an animal and i am eating ");
}
float  sum (int a ,float b){
    return a+b;
}
}
class dog extends Animal {
    void eat(){
        System.out.println("i am a  dog and i am eating ");
    }
float  sum (float  b , int  a ){
    return a*b;
}
}
// parent and child  classes both contain the same function with a different defination 