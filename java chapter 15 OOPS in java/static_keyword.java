public class static_keyword {
    public static void main(String[] args) {
     student s1 = new student();
     s1.schoolName =  "Sanik school";
     System.out.println(s1.schoolName);
     student s2 = new student();
     System.out.println(s2.schoolName);

    student s3 = new student();
    s3.schoolName =  "Sanik school chittaurgarh";
     System.out.println(s3.schoolName);
     student s4 = new student();
     System.out.println(s4.schoolName);
     student s5 = new student();
     System.out.println(s5.schoolName);
    }
}
class student {
    String name;
    int roll;
    static String schoolName;
    void setname(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }
    // static function 
    static int returnPercentage(int physics , int chemistry , int mathematics ){
        return (physics+chemistry+mathematics)/3;
    }
}
// static keyword 
// static keyword in java is used to share the same variable or method of a given class 
// properties 
// function 
// blocks 
// nested classes 
