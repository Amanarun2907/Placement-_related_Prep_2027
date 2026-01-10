public class Access_Modifiers{

    public static void main(String[] args ){
    pen p1 = new pen(); // constructor // created a pen object called p1
    // object is created in heap 
    // p1.setColor("Blue");
    // System.out.println(p1.color); // Blue 
    // p1.setTip(7);
    // System.out.println(p1.tip); // 7
    // p1.setColor("Red");
    // System.out.println(p1.color); // Red
    // p1.tip = 12;
    // System.out.println(p1.tip); // 12
     BankAccount myAcc = new BankAccount();
     myAcc.username="Arun kumar jain";
     System.out.println(myAcc.username);
     myAcc.setPassword("Arun@12345");

    }
    }
   class pen{ //class pen
      String color; // color of pen 
      int tip; // thickness of the pen 
      void setColor(String newColor) {
        color = newColor;
      }
      void setTip(int newTip){
        tip = newTip;
      }
    }
     class student{ // class student 
        String name;
        int age;
        float percentage;
        void calPercentage(int phy,int chem,int math){ // calculating percentage 
            percentage = (phy+chem+math)/3;
        }
    }
   class BankAccount{
    public  String username;
    private String password;
    public void setPassword (String pwd){
    password = pwd;
    }
    } 
    // Access modifiers 
    // private (within class )
    // default (within class) (within package )
    // protected (within class) (within package) (outside package by subclass only )
    // public (within class ) (within package) (outside package by subclass only ) (outside package )
    
