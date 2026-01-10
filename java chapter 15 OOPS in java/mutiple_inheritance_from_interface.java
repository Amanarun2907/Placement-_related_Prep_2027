public class mutiple_inheritance_from_interface {
 public static void main(String[] args) {
     number n = new number ();
     System.out.println(n.sum(10,5));
     System.out.println(n.sub(10,5));
     System.out.println(n.multiply(10,5));
     System.out.println(n.division(10,5));
 }   
}
interface operation {
    int sum (int a,int b);
    int sub(int a,int b);
}
interface operation1{
    int multiply (int a , int b);
    int division(int a , int b);
}
class number implements operation , operation1{
    public int sum (int x , int y ){
        return x+y;
    }
    public int sub (int x , int y ){
        return x-y;
    }
    public int multiply (int x , int y ){
        return x*y;
    }
    public int division (int x , int y){
        return x/y;
    }
}
// example
interface herbivore{

}
interface carnivore{

}
class bear implements herbivore , carnivore{

}