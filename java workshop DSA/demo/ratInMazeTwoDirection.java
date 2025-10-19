public class ratInMazeTwoDirection {
    public static int maze(int sr, int sc, int er, int ec){
        // base case
        if(sr > er || sc > ec) return 0;
        if(sr == er || sc == ec)return 1;
        int downWards = maze(sr+1,sc,er,ec);
        int rightWay = maze(sr, sc+1,er,ec);
        int totalWays= downWards + rightWay;
        return totalWays;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int count = maze(1, 1, row, col);
        System.out.println(count);      
    }   
}
