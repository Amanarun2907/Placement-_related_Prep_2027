import java.util.*;
public class Max_Area_Revision {
    public static int  Max_Area(int arr[]){
        int size1 = arr.length; 
        int nsl[] = new int [arr.length]; // Next smaller left (forward)
        int nsr[] = new int [arr.length]; // Next smaller right (backward)
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int max_area = 0;
        // next smaller right
        for (int i = arr.length-1;i>=0;i--){
           while(!s1.isEmpty() && arr[s1.peek()]>arr[i]){
            s1.pop();
           }
        if (s1.isEmpty()){
          nsr[i] = size1;
        }
        else{
            nsr[i]=s1.peek();  // store index not element 
        }
        s1.push(i);
        }
        // next smaller left
        for (int i = 0;i<arr.length;i++){
        while(!s2.isEmpty() && arr[s2.peek()]>arr[i]){
            s2.pop();
           }
        if (s2.isEmpty()){
          nsl[i] = -1;
        }
        else{
            nsl[i]=s2.peek(); // store index not element  
        }
        s2.push(i);
        }
        for (int i = 0;i<arr.length;i++){
            int bar_height = arr[i];
            int next_smaller_left = nsl[i];
            int next_smaller_right = nsr[i];
            int area = bar_height *(next_smaller_right - next_smaller_left -1 ); //Formulla i-j-1
            max_area = Math.max(area,max_area);
        }
        return max_area;
    }
    public static void main (String args[]){
        int arr[]= {2,1,5,6,2,3};
        int ans = Max_Area(arr);
        System.out.println("The Maximum area captured is: " + ans);
    }
}
