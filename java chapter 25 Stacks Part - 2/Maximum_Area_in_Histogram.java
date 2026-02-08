// given an array of integers height representing the histogram bar 
// height where the width of the each bar is 1 , return the area of the largest rectangle in the histogram 
// height = [2,1,5,6,2,3]
// if nsr is not found then return 6 (length of array ) and if nsl is not found return -1 
// we are taking about the index 
// Max area with respect of i :       nsr            nsl            i*(nsr-nsl-1)
// Max area with respect of 2 :       1               -1             2*(1-(-1)-1) = 2 
// Max area with respect of 1 :       6               -1             1*(6-(-1)-1) = 6 
// Max area with respect of 5 :       4                1             5*(4-1-1) =  10
// Max area with respect of 6 :       4                2             6*(4-2-1) = 6 
// Max area with respect of 2 :       6                1             2*(6-1-1) = 8
// Max area with respect of 3 :       6                4             3*(6-4-1) = 3
// final answer  = 10 (is my final answer)


import java.util.*;
public class Maximum_Area_in_Histogram {
    public static void max_Area (int arr[]){
        int max_Area = 0 ; // this is the place where i will store my final answer 
        int nsr[]=new int [arr.length];
        int nsl[]=new int [arr.length];
        // next_smaller right 
        Stack<Integer> s = new Stack <>(); // stack creation 
        for (int i = arr.length-1 ;i>=0;i--){ // backward 
        // smaller
        // in stack we are actually storing index 
        while(s.isEmpty()!=true && arr[s.peek()]>=arr[i] ){
            s.pop();
        } 
        if(s.isEmpty()==true){
            nsr[i]= arr.length;
        }
        else{
            // we have to store the index
            nsr[i] = s.peek();
        }
        s.push(i);
        }
        // next_smaller left 
        s = new Stack <>(); // Now we have to first empty our stack and then we have to use it 
        for (int i = 0 ;i<arr.length;i++){ // forward 
        // smaller
        // in stack we are actually storing index 
        while(s.isEmpty()!=true && arr[s.peek()]>=arr[i] ){
            s.pop();
        } 
        if(s.isEmpty()==true){
            nsl[i]= -1;
        }
        else{
            // we have to store the index 
            nsl[i] =  s.peek();
        }
        s.push(i);
        }
    // Main process 
    // height = height of the bar 
    // height = arr[i];
    // width = nsr[i] - nsl[i]-1
    // area = height*width 
    for (int i = 0 ;i<arr.length;i++){
        int height = arr[i];
        int width = nsr[i]-nsl[i]-1;
        int area = height*width;
        max_Area = Math.max(area,max_Area);
    }
    System.out.println("The maximum area of the histogram is : "+ max_Area);
    }
    public static void main(String[] args) {
        int arr[ ] = {2,1,5,6,2,3};
        max_Area(arr);
    }
}
