
//path = 1 and no path = 0

public class RatInaMaze {
    static int n = 4 ; //size of the maze

    //function to check if x and y is a valid positon
    public static boolean isSafe(int[][] maze , int x , int y){
       if(x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1){
        return true;
       }
       return false;
    }

    public static boolean solveMaze(int[][] maze , int x , int y , int[][] solution) {
        //base case , if x and y is the destination then return true>
        if(x == n - 1 && y == n - 1){
            solution[x][y] = 1;
            return true;
        }
        //check if maze[x][y] is valid >
        if(isSafe(maze, x, y)){
            solution[x][y] =1; //jodi array safe hoye jaoar jonne tale solution array te position k 1 mark kre debo
            //move right >
            if(solveMaze(maze, x+1, y, solution)){
                return true;
            }
            //move down
            if(solveMaze(maze, x, y+1, solution)){
                return true;
            }
            solution[x][y] = 0; //back track , jodi move na korte pari posn e tale ferod chole jao ager posn e
            return false;
        }
        return false; //if path not safe 
    }

    //fucntion to print the solution path >>
    public static void printSolution(int[][] solution){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    //main function >>
    public static void main(String[] args) {
        // 0 - open path
        // 1 = closed path
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        //solution matrix to store the path
        int[][] solution = new int[n][n];

        //solve the maze >>
        if(solveMaze(maze, 0, 0, solution)){
            printSolution(solution);
        } else {
            System.out.println("No solution exists!!");
        }
    }
}
