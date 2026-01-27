import java.util.*;
public class Trapping_rain_water{
    // we need to find the volumn of the rain water that gets trapped between the lines 
    // non-negative integers 
    // Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, 
    // compute how much water can be trapped between the blocks during the rainy season.
    // examples 
   //  Input: arr[] = [3, 0, 1, 0, 4, 0 2]
   //  Output: 10
   // Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units. 


   // Start 
   // i need to find the amount(area) of the trapped water 
   // formulla area = (water-level - bar height/bar level)*width [Amount of water captured by one bar ]
   // As width = 1 
   // formulla = summation of all bars ((water-level - bar height/bar level))
   // water-level = Math.max(left_height,right_height)
   // we need to find the left height and right height 


   public static int water_trap (ArrayList<Integer> list){
       // make a structure for left height
       ArrayList<Integer> left_height = new ArrayList<>(); // Auxillary array 
       
       left_height.add(list.get(0));
         // make a structure for right height
       ArrayList<Integer> right_height = new ArrayList<>(); // Auxillary array 
       right_height.add(0,list.get(list.size()-1)); // starting from last index
      // list.add (i,element) // it will shift all other element and place this element at the index i

      // filling the left_height
      for(int i = 1; i <list.size();i++){
        left_height.add(Math.max(left_height.get(i-1),list.get(i)));
      }

        // filling the right_height
        
      for(int i = list.size()-2 ; i>=0;i--){
        right_height.add(0,Math.max(right_height.get(0),list.get(i)));
      }
     int ans = 0;
     for(int i = 0;i<list.size();i++){
        int water_level = Math.min(right_height.get(i),left_height.get(i));
        ans = ans + (water_level-list.get(i));
     }
     return ans;
   }
   // list.add(i,element) != list.set(i,element) because add will shift the elements and set will replace the element at index i ....
    public static void main (String [] args){
ArrayList<Integer> list = new ArrayList<>();
list.add(4);
list.add(2);
list.add(0);
list.add(6);
list.add(3);
list.add(2);
list.add(5);

System.out.println(water_trap(list));
    }
}

