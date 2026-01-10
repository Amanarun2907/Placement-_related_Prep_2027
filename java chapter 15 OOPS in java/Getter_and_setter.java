public class Getter_and_setter {
    public static void main(String[] args) {
        pen p1 = new pen ();
        p1.setColor("Black");
        System.out.println("the color of the pen is: "+p1.getColor());
        p1.setTip(10);
        System.out.println("the tickness of the pen is: "+p1.getTip());
    }
}
 class pen{ //class pen
   private String color; // color of pen 
   private int tip; // thickness of the pen 
    void setColor(String color) {
      this.color = color;
    }
    void setTip(int tip){
      this.tip = tip;
    }
    int getTip(){
        return this.tip;
    }
    String getColor(){
        return this.color;
    }
}
// get : to return the value 
// set : to modify the value 
// this keyword is used to refer to the current object