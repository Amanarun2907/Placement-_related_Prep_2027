public class classes_and_object{

public static void main(String[] args ){
pen p1 = new pen(); // constructor // created a pen object called p1
// object is created in heap 
p1.setColor("Blue");
System.out.println(p1.color); // Blue 
p1.setTip(7);
System.out.println(p1.tip); // 7
p1.setColor("Red");
System.out.println(p1.color); // Red
p1.tip = 12;
System.out.println(p1.tip); // 12
}
}
class pen{ //class pen
  String color; // color of pen 
  int tip; // thickness of the pen 
  void setColor(String newColor) {
   this. color = newColor;
  }
  void setTip(int newTip){
    this.tip = newTip;
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
// object (entities in the real world )
// classes (group of these entities)
// classes having attributes (properties) and function (behaviours).


