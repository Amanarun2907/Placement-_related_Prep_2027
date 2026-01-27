import java.util.*;
public class Container_with_most_water {
    // we have to solve the problem related to container with most water 
    // for given n-lines on the x-axis , use 2 lines to first form a container then 
    // select those two lines which can capture maximum water so that the the area should be maximum ...
    // Pick pair of lines one by one and try to cover all the possible pair and find the water captured in each case .....
  
    // function of the container_with_most_water;
    // brute force 
    public static int max_water_cap (ArrayList<Integer>list){
        int max_water= 0; 
        // for making container we atleast have to use 2 lines , if only one line then water captured = = 0 ....
     // first we have to select the pair 
     for(int i = 0 ; i<list.size();i++){
        for(int j = i+1 ;j<list.size();j++){
          int height = Math.min(list.get(i),list.get(j));
          int width = j-1;
          int curr_water = height*width ;
          max_water = Math.max(max_water,curr_water);
        }
     }
     return max_water;
    }
    // time complexity = O(n^2);;
    

    // function of the container_with_most_water;
    // 2 pointer approach (lp and rp); 
    public static int max_water_cap_1(ArrayList<Integer>list){
        int max_water = 0;
        // first initialize the lp and rp 
        int lp = 0; // with 0th index 
        int rp  = list.size()-1;
        while(lp<rp){
            // working inside the loop
            int height = Math.min(list.get(lp),list.get(rp)); // calculation of the height 
            int width = rp-lp;
            int curr_water = height*width;
            max_water = Math.max(max_water,curr_water);
            // now like merging in merge sort
            // updation
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max_water;
    }



    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>(); // creating the arraylist here
        // add the element in the arraylist 
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // functional calling 
        int srk = max_water_cap(height);
        int srk2 = max_water_cap_1(height);
        System.out.println(srk);
        System.out.println(srk2);
    }
}
