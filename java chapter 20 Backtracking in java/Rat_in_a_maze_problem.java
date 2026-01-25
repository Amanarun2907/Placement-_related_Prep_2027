
public class Rat_in_a_maze_problem{
    // problem statement 
    //  Movement allowed = up , down , left, right 
    // Matrix --> 0 = not allowed , 1 ---> allowed 
    // one cell is not visited multiple times (condition )
    // source = (0,0)
    // destination = (n-1,n-1)
    // Matrix n*n
    // if on (0,0) there is 0 then no answer 
public static boolean isSafe(int newx,int newy,int maze[][],boolean visited[][],int n)
{  


     if (newx>=n||newy>=n||newx<0||newy<0 || visited[newx][newy]==true || maze[newx][newy]==0 ){
        return false;
     }
    // if(newx>=n||newy>=n||newx<0||newy<0)
    // {  // out of bound case
    //     return false ;
    // }
    // if(visited[newx][newy]==true)
    // { 
    //     // already visited
    //     return false;
    // }
    // if(maze[newx][newy]==0){
    //     // blocked 
    //     return false;
    // }
    return true;
}

    public static void solve (int maze[][],boolean visited[][],int n,StringBuilder ans,String output,int curr_x,int curr_y,int dest_x,int dest_y)
    { 
       // base case 
       if(curr_x ==dest_x && curr_y == dest_y){
        // rat reached its destination 
        ans.append(output);
        // System.out.println(ans);
        return;
       }
       
       
       // magical line : we solve 1 case and recursion solve remaining case 
    //    direction      row      column 
    //    up =           -1         0
    //    down=           +1        0
    //    left=            0        -1
    //    right =          0        +1


    // int dx[] = {-1,+1,0,0};
    // int dy []= {0,0,-1,+1};
    // char move [] = {'U','D','L','R'};
    // for (int i = 0 ;i<4;i++){
    //     int newx = curr_x + dx[i];
    //     int newy = curr_y + dy[i];
    //     char  movement = move[i];
    //     if(isSafe(newx,newy,maze,visited,n))
    //    {
    //     visited[newx][newy] = true;  // work to do must 
    //     solve(maze, visited, n, ans, output+String.valueOf(movement), newx, newy, dest_x, dest_y); // recursion 
    //     visited[newx][newy] = false; // backtracking 
    //    }
    // }


       // 1 case -> up,down,left,right
       // up
       int newx = curr_x-1; // corrdinates 
       int newy = curr_y;  // corrdinates 
       if(isSafe(newx,newy,maze,visited,n))
       {
        visited[newx][newy] = true;  // work to do must 
        solve(maze, visited, n, ans, output+"U", newx, newy, dest_x, dest_y); // recursion 
        visited[newx][newy] = false; // backtracking 
       }
       //down
       newx = curr_x+1;
       newy = curr_y;
       if(isSafe(newx,newy,maze,visited,n))
       {
        visited[newx][newy] = true;
        solve(maze, visited, n, ans, output+"D", newx, newy, dest_x, dest_y);
        visited[newx][newy] = false;
       }
       // left
        newx = curr_x;
        newy = curr_y-1;
       if(isSafe(newx,newy,maze,visited,n))
       {
        visited[newx][newy] = true;
        solve(maze, visited, n, ans, output+"L", newx, newy, dest_x, dest_y);
        visited[newx][newy] = false;
       }
       // right
        newx = curr_x;
        newy = curr_y+1;
       if(isSafe(newx,newy,maze,visited,n))
       {
        visited[newx][newy] = true;
        solve(maze, visited, n, ans, output+"R", newx, newy, dest_x, dest_y);
        visited[newx][newy] = false;
       }
    }
    // function for find path 
    public static String  findpath(int maze[][],int n)
    {
        // maze is the 2-D array
        // n is the dimension 
       StringBuilder ans= new StringBuilder(""); // store final answer 
        String output=""; // store possible option 
        boolean visited [][] = new boolean [n][n]; // 2-d array of visited cell 
        int curr_x=0;
        int curr_y=0;
        int dest_x= n-1;
        int dest_y= n-1;
          //start me RAT (0,0) pr hoga, that why visited true mark karo
        visited[0][0]=true; // very important condition 


        if(maze[0][0]==0){
            return ans.toString();  // no answer found 
        }

        // function call 
        solve(maze,visited,n,ans,output,curr_x,curr_y,dest_x,dest_y);
        return ans.toString();
    }


    public static void main(String[] args) {
      int maze[][] = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
    //   boolean visited[][] = new boolean [4][4];
        System.out.println(findpath(maze, 4));
}
}











































// observation  1 
// boolean arr[][] = new boolean [4][4];
// for (int i = 0;i<4;i++)
// {
//     for(int j = 0;j<4;j++)
//     {
//         System.out.print(arr[i][j]+" ");
//     }
//     System.out.println();
// }
// }
// false false false false 
// false false false false 
// false false false false 
// false false false false 


// observation 2 
// String aman = "";
//       for (int i =0;i<aman.length();i++)
//       {
//         System.out.print(aman.charAt(i)+" ");
//       }
//     }
    