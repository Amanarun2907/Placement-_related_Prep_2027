// import java.util.ArrayList;
import java.util.ArrayList;


public class implementation_of_array_list_in_java{
 public static void swap(ArrayList<Integer>list,int idx1,int idx2){
    int srk = list.get(idx2); 
    list.set(idx2,list.get(idx1));
    list.set(idx1 , srk);
    // srk is also known as king of bollywood also known as shahrukh khan ....
    for(int i = 0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }
    System.out.println();
 }

    public static void main (String [] args){
    ArrayList<Integer>list = new ArrayList<>();
    ArrayList<String>list1 = new ArrayList<>();
    ArrayList<Boolean>list2 = new ArrayList<>();
    ArrayList<Character>list3 = new ArrayList<>();
    ArrayList<Long>list4 = new ArrayList<>();

    // how to add the element in the array list
    list.add(1); 
     list.add(2); // O(1)
     list.add(3);
     list.add(4);
     list.add(5);

     // how to print the array list......
     System.out.println(list); // print the array list

     // get element at index
     int element = list.get(2); // O(1)
     System.out.println(element); // get the element at index 2 // 3 as output


     //delete an element // O(n) ----> Linear time complexity
     list.remove(2);
        System.out.println(list); // [1, 2, 4, 5]


    // Set element at index 
    // linear time complexity O(n)
    list.set(2,100);
    System.out.println(list); // [1, 2, 100, 5]


    System.out.println(list.contains(5)); // true
    System.out.println(list.contains(25)); // false 


     list.add(0,10000);
        System.out.println(list); // [10000, 1, 2, 100, 5]



    int x = list.get(3);
    System.out.println(x); // 100


   // System.out.println("the size of the array list is : " + list.size());
   for (int i = 0 ; i<list.size();i++){
    System.out.print(list.get(i)+" ");
   }
   System.out.println();


   // Reverse the array list
   for(int i = list.size()-1;i>=0;i--){
    System.out.print(list.get(i)+" ");
   }
   System.out.println();
 

// Maximum element in the array list 
System.out.println(list);   

int maximum = Integer.MIN_VALUE;
for(int i = 0;i<list.size();i++){
    if(maximum<list.get(i)){
        maximum = list.get(i);
    } // maximum = Math.max(maximum,list.get(i))
}
System.out.println("the maximum element in the array list is : " + maximum);
  


// print the list 
System.out.println(list);
int idx1 = 1 , idx2= 2;
swap(list,idx1,idx2); // swap of the elements and print the array list .....








    }
}

// part of  java collections framework
// dynamic array