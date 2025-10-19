public class ratInMazeInFourDirection {
    public static void maze(int sr, int sc, int er, int ec,String s, boolean[][] isVisited){
        // base case
        if(sr < 0 || sc < 0)return;
        if(sr > er || sc > er )return;
        if(isVisited[sr][sc] == true)return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // right
        maze(sr, sc+1, er, ec, s+"R", isVisited);
        //left
        maze(sr, sc-1, er, ec, s+"L", isVisited);
        // down
        maze(sr+1, sc, er, ec, s+"D", isVisited);
        //up
        maze(sr-1, sc, er, ec, s+"U", isVisited);
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] isVisited = new boolean [row][col];
        maze(0 , 0, row-1,col-1, "", isVisited);
    }
    
}
