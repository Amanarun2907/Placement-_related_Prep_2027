import java.util.*;
public class Multi_dimensional_AL {
    public static void main(String [] args){
        //Multi-dimensional array list
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>(); // list 1
        ArrayList<Integer> list2 = new ArrayList<>(); // list 2
        ArrayList<Integer> list3 = new ArrayList<>(); // list 3
        

        for(int i = 1;i<=5;i++){
            list1.add(i*1); // 1 2 3 4 5 
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }


        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
         
        System.out.println(mainlist); // [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]
        for(int i = 0;i<mainlist.size();i++){
            ArrayList<Integer> currlist = mainlist.get(i); // current list 
            for(int j = 0 ; j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
       //  1 2 3 4 5 
       //  2 4 6 8 10 
       //  3 6 9 12 15 

            list3.remove(3);
            list3.remove(1);
            System.out.println(list3); // [3, 9, 15]
            System.out.println(mainlist); // [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 9, 15]]

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // mainlist.add(list1);
        //  ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(4); list2.add(5); list2.add(6);
        // mainlist.add(list2);
        // for(int i = 0;i<mainlist.size();i++){
        //     ArrayList<Integer> currList = mainlist.get(i);
        //     for(int j = 0 ;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainlist); 


       int arr[] = {3,2,1,6,7,8,9,4};
       Arrays.sort(arr);
       for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }   
     System.out.println();
        



    }
}
