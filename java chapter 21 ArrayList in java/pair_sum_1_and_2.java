import java.util.*;
public class pair_sum_1_and_2{
    // pair sum 1 (brute force)
    // arraylist should be sorted and if it is not sorted make it sorted and then solve the question 
    // duplicates are not allowed .......
    public static boolean pair_sum (ArrayList<Integer>list,int target){
        Collections.sort(list);  // to make arraylist sorted 
        // target means sum of the pair 
         for(int i = 0 ;i<list.size();i++){
            for(int j = i+1 ;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
         }
         return false;
    }

        

    // pair sum 1 (2 pointer approach)  
    // note : Duplicates are not allowed ......
    // arraylist should be sorted 
    public static boolean pair_sum_1(ArrayList<Integer> list , int target){
        Collections.sort(list); // to make arraylist sorted 
        int lp = 0 ; // always with smallest 
        int rp = list.size()-1; // always with largest 
        while(lp<rp){  // lp!=rp
         if (list.get(lp)+list.get(rp)== target) {
             return true;
         }
         if(list.get(lp)+list.get(rp)<target){
            // since array is sorted
            lp++;
         }
         else{
            rp--;
         }
        }
        return false;
    }

    // pair sum 2 (2 pointer approach )
    // arraylist is sorted rotated array about pivot element 
    public static boolean pair_sum_2(ArrayList<Integer> list , int target ){
        // finding the pivot element 
        int bp = -1 ; // not  blood pressure , it is breaking point // Initialization with the invalid index 
        for(int i = 0;i<list.size()-1;i++){
           if(list.get(i)>list.get(i+1)){
            bp = i; // index of the largest element 
            break;
           }
        }
        // assign value to lp 
        // lp assign to smallest 
          int lp = bp+1;
        // assign value to rp 
        // rp assign to largest 
          int rp = bp;

        while(lp!=rp){   // you can not use lp<rp here that is wrong so please use lp!=rp   
        // case 1
        if(list.get(lp)+list.get(rp)==target){
            return true; // if we found a pair whose sum of the elements is equal to the target ...............
        }
        // case 2 
        if(list.get(lp)+list.get(rp)<target){
            // left pointer 
            lp = ((lp+1)%list.size()); // do not use lp++ directly here as we need rotational movement  
        }
        // case 3 
        else{
            rp = ((list.size()+rp-1)%list.size()); // do not use rp-- here directly as we need rotational movement here ....
        }
        }
        return false; // if element is not found  then ....
        // return false 

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); //0
        list.add(4);  //1
        list.add(5);//2
        list.add(3); // 3
        list.add(9); // 4
        list.add(7); // 5
        list.add(8); // 6
        list.add(6); // 7
        int target = 20; // target means sum of the pair 
        // System.out.println(pair_sum(list, target)); // true ;
        // System.out.println(pair_sum_1(list, target)); // true ;
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11); //0
        list1.add(15);  //1
        list1.add(6);//2
        list1.add(8); // 3
        list1.add(9); // 4
        list1.add(10); // 5
        int target1 = 16;
         System.out.println(pair_sum_2(list1, target1));
    }
}