import java.util.*;
// import java.util.arraylist;
// import java.util.Collections;
// import java.util.Scanner;
// import java .util.Arrays;
public class Sorting_an_AL {
    public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    //   int arr[]= new int[5];
    //   for(int i = 0 ; i<arr.length;i++){
    //     arr[i]= sc.nextInt();
    //   }  
    //   Arrays.sort(arr); // sorting in ascending order
    //   for(int i = 0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    //   }
    //   System.out.println("");

    ArrayList<Integer>list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(5);
    list.add(3);
    list.add(4);
    System.out.println(list);
    Collections.sort(list); // sorting in ascending order ;
    System.out.println(list);
    // sorting in descending order
    Collections.sort(list,Collections.reverseOrder());
    // Comparator---fnx that define the logic of sorting .......... 
    System.out.println(list);


    
    }
}
