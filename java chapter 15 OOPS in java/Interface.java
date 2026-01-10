public class Interface {
    public static void main(String[] args) {
        // queen q = new queen();
        // q.moves();
        Rook R = new Rook ();
        R.moves();
    }
}
interface chessPlayer{
    void moves();
    
} 
class queen implements chessPlayer{
   public  void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 direction )");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    } 
    Rook(){ // constructor 
        System.out.println("constructor of Rook is called as you made the object of  Rook");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (by 1 step )");
    } 
}


// interface is a blueprint of  class 
// class is a blueprint of object 
// To implement multiple inheritance  
// Derived class derived from more than one parent class .  (Multiple inheritance)
// in interfaces we can achieve 100 percent abstraction 
//  properties 
// All methods are public , abstract and without implementation 
// used to achieve total abstraction    
//variables in the interfaces are final , public and static .

