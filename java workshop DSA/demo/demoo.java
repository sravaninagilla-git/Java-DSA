public class demoo {
    public static boolean isSafe(char[][] board,int row,int col){
        int n = board.length;
        // check the row 
        for(int j = 0; j <n;j++){
            if(board[row][j] == 'Q')return false;
        }
        //check column
        for(int i = 0 ; i<n;i++){
            if(board[i][col]== 'Q')return false;
        }
        //check upper right
        int i = row;
        int j = col;
        while(i >= 0 && j < n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++; 
        }
        // check lower right
        i =row;
        j = col;
        while(i < n && j < n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        // check lower left
        i = row;
        j = col;
        while(i<n && j >= 0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        //check upper left
        i =row;
        j = col;
        while(i >=0 && j < n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }
          return true;
    }
    public static void nQueen(char [][] board, int row){
        int n = board.length;
        // base case
        if(row == n){
            for(int i = 0; i <n ;i++){
                for(int j =0; j <n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            return;
        }
        //traverse over row
        for(int j=0; j<n;j++){
            if(isSafe(board, row,j)){
                board[row][j] = 'Q';
                nQueen(board, row + 1);
                board[row][j] = '.';
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char [][] board = new char [n][n];
        for(int i =0;i < n; i++){
            for(int j = 0; j < n ; j++){
                board[i][j] = '.';
            }
        }
        nQueen(board, 0);
        }
    }
    

