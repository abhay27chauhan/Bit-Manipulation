class sudokuSolver{

    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }

    public static void solution(int[][] arr, int[] rows, int[] cols, int[][] grid, int i, int j){
        if(i == arr.length){
            display(arr);
            return;
        }

        int ni = 0;
        int nj = 0;

        if(j == arr[0].length-1){
            ni = i+1;
            nj = 0;
        }else{
            ni = i;
            nj = j+1;
        }

        if(arr[i][j] > 0){
            solution(arr, rows, cols, grid, ni, nj);
        }else{
            for(int ops = 1; ops<=9; ops++){
                if((rows[i] & (1 << ops)) == 0 && (cols[j] & (1 << ops)) == 0 &&(grid[i/3][j/3] & (1 << ops)) == 0){
                    arr[i][j] = ops;
                    rows[i] ^= (1 << ops);
                    cols[j] ^= (1 << ops);
                    grid[i/3][j/3] ^= (1 << ops);
                    solution(arr, rows, cols, grid, ni, nj);
                    grid[i/3][j/3] ^= (1 << ops);
                    cols[j] ^= (1 << ops);
                    rows[i] ^= (1 << ops);
                    arr[i][j] = 0;
                }
            }
            
        }
    }

    public static void main(String[] args){
        int[][] digit = {{3,0,6,5,0,8,4,0,0},
                       {5,2,0,0,0,0,0,0,0},
                       {0,8,7,0,0,0,0,3,1},
                       {0,0,3,0,1,0,0,8,0},
                       {9,0,0,8,6,3,0,0,5},
                       {0,5,0,0,9,0,6,0,0},
                       {1,3,0,0,0,0,2,5,0},
                       {0,0,0,0,0,0,0,7,4},
                       {0,0,5,2,0,6,3,0,0}
                    };

        int[] rows = new int[9];
        int[] cols = new int[9];
        int[][] grid = new int[3][3];
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                rows[i] |= (1 << digit[i][j]);
                cols[j] |= (1 << digit[i][j]);
                grid[i/3][j/3] |= (1 << digit[i][j]);
            }
        }

        solution(digit, rows, cols, grid, 0, 0);
    }
}