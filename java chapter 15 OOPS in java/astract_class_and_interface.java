public class astract_class_and_interface {
    public static void main(String[] args) {
       Rajasthan r1  = new Rajasthan ();
       r1.location();
      Gujrat g1  = new Gujrat  ();
       g1.location();
     chittorgarh ch1 = new chittorgarh ();
     ch1.temple_details();
     ch1.monument_Details();
    }
}

abstract class Election {
    Election (){ // constructor 
        System.out.println("welcome to the general election 2029");
    }
    abstract void location();
    void Intro (){
        System.out.println("Free and fair election is the responsibility of the Election commision of India ");
    }
}

class Rajasthan extends Election {
    void location (){
        System.out.println("Rajasthan");
    }
}
class Gujrat extends Election {
    void location (){
        System.out.println("Gujrat");
    }
}
class Haryana extends Election {
    void location (){
        System.out.println("Haryana");
    }
}


interface momument {
   
    void monument_Details();
    // interface ---> method ---> abstract , public and without implementation 
    // variable ---> static , final and public 
}
interface temple {
    void temple_details(); 
}

class chittorgarh implements momument , temple {
    public void monument_Details (){
        System.out.println("Chittorgarh fort ");
    }
    public void temple_details (){
        System.out.println("Sawariya Seth Mandir");
    }
}