// static variable 
public class PQ8{
    public static void main(String[] args) {
        System.out.println(book.count); // 0
        book b1 =new book (150);
        System.out.println(b1.count); // 1
        book b2 =new book (250);
        System.out.println(b2.count); // 2
        book b3 =new book (350);
        System.out.println(b2.count); // 3
        System.out.println(b3.count); // 3
        System.out.println(book.count); //3
        System.out.println(b1.count); // 3 
    }
}
class book {
    int price ;
    static int count ;
    // constructor 
    public book (int price){
        this.price = price;
        count++;
    }
}