package Recursion;


public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3,3));
        // path("",3,3);

        boolean[][] maze = {
            {true,true,true,true},
            {true,false,true,true},
            {true,true,false,true},
        };

        mazeRestrictions("", maze, 0, 0);
    }

    //can only go right or down direction
    public static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        System.out.println(r+","+c);
        int left = count(r-1,c);
        int diagonal = count(r-1,c-1);
        int right = count(r,c-1);

        return left+right+diagonal;
    }

    public static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1 && c>1){
            path(p+"D",r-1,c-1);
        }

        if(r>1){
            path(p+"V",r-1,c);
        }

        if(c>1){
            path(p+"H",r,c-1);
        }
    }


    //maze with restrictions
    public static void mazeRestrictions(String p , boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        //  System.out.println(p);

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1 && c<maze[0].length-1){
            mazeRestrictions(p+"D", maze, r+1, c+1);
        }

        if(r<maze.length-1){
            mazeRestrictions(p+"V", maze, r+1, c);
        }
        if(c<maze[0].length-1){
            mazeRestrictions(p+"H", maze, r, c+1);
        }
        
    }
}
