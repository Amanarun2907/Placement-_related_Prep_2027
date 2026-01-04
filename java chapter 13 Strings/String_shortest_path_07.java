public class String_shortest_path_07 {
    // creating a function 
    // Here particle is starting from the origin so initial coordinate are (0,0)
    public static int  getshortestpath(String path){
        int y = 0,x =0; // particle starts from origin 
        for (int i = 0 ; i<path.length();i++){// length function  of string class is used 
        char dir = path.charAt(i); // stores the value of the character at index i of the given string 
        // north (y++)  [X will remain constant]
        if(dir =='N'){
            y++; // y cooridnate
        }
        //south (y--) [X will remain constant]
        else if (dir =='S'){
        y--; // y cooridnate
        }
        // east (x++) [Y will remain constant]
        else if (dir == 'E'){
            x++; // x cooridnate
        }
        // west (x--) [Y will remain constant]
        else if (dir =='W'){
         x--; // x cooridnate
        }
        }
        int x2 = (x*x);
        int y2 = (y*y);
        return (int)Math.sqrt(x2+y2); // here i have done type casting to convert my result into integer value as my resturn type is integer so i have done type casting 
    }
    public static void main(String[] args) {
    // create a string 
    String path = "WNEENESENNN"; // here we are calculating displacement of the body 
    System.out.println(getshortestpath(path)); // function call 
    }
}
