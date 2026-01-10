class Vehicle {}
class car extends Vehicle {}
public class PQ4 {
   public static void main(String[] args) {
       car c = new car (); // correct
       Vehicle v = new Vehicle ();// correct
       Vehicle v1 = new car(); // correct 
    //    car c1 = new Vehicle (); throws error so this is incorrect 
   } 
}
// parent reference = child object 