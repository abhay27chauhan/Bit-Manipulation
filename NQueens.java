class NQueens{

    public static void display(boolean[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }

    public static void solution(boolean[][] arr, int row, int cols, int ndia, int rdia, String asf){
        if(row == arr.length){
            display(arr);
            System.out.println();
            return;
        }

        for(int col = 0; col<arr[0].length; col++){
            if((cols & (1 << col)) == 0 && (ndia & (1 << (row + col))) == 0 && (rdia & (1 << (row-col + arr.length-1))) == 0){
                arr[row][col] = true;
                cols ^= (1<<col);
                ndia ^= (1<<(row+col));
                rdia ^= (1<<(row - col + arr.length-1));
                solution(arr, row+1, cols, ndia, rdia, asf + row + "-" + col + ", ");
                rdia ^= (1<<(row - col + arr.length-1));
                ndia ^= (1<<(row+col));
                cols ^= (1<<col);
                arr[row][col] = false;
            }
        }
    }

    public static void main(String[] args){
        boolean[][] arr = new boolean[4][4];

        int cols = 0;
        int ndia = 0;
        int rdia = 0;

        solution(arr, 0, cols, ndia, rdia, "");
    }
}